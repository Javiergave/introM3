import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;

public class Zoo {

    private static final String NOM_BASE_DE_DADES = "animals.bd";

    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +

                                                     NOM_BASE_DE_DADES;

    private Connection conn = null;


    public void connecta() throws SQLException {

        if (conn != null) return;   // ja connectat

        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);

    }


    public void desconnecta() throws SQLException {

        if (conn == null) return; // ja desconnectat

        conn.close();

        conn = null;

    }

    public void creaTaulaCategories() throws SQLException {

        String sql = "drop table if exists  categories ;"+"CREATE TABLE  CATEGORIES (" +
    
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
    
                     "       nom       VARCHAR(40))";
    
        Statement st = null;
    
        try {
    
            st = conn.createStatement();
    
            st.executeUpdate(sql);
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    
    }
    public void eliminaTaulaCategories() throws SQLException{
        String sql = "drop TABLE if exists CATEGORIES;";
    
        Statement st = null;
    
        try {
            eliminaTaulaAnimals();
    
            st = conn.createStatement();
    
            st.executeUpdate(sql);
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    }
    
    public void afegeixCategoria(Categoria categoria) throws SQLException {

        String sql = String.format(
    
                "INSERT INTO CATEGORIES (nom) VALUES ('%s')",
    
                categoria.getNom());

        String sql2 = "select id from categories where nom='"+categoria.getNom()+"' ORDER BY id limit 1;";

    
        Statement st = null;
    
        try {
    
            st = conn.createStatement();
    
            st.executeUpdate(sql);

            ResultSet rs= st.executeQuery(sql2);

            rs.next();
            int id = rs.getInt("id");
            categoria.setId(id);
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
        }

    
    }
    public Categoria obteCategoriaPerNom(String nom) throws SQLException{
        String sql = "select id from categories where nom='"+nom+"' ORDER BY id limit 1;";
        Statement st = null;
        try {

            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int id = rs.getInt("id");
            rs.close();
            if(id<1){
                return null;
            }
            return new Categoria(id,nom);

        } finally {

            if (st != null) {

                st.close();

            }

        }
    }
    public List<Categoria> recuperaCategories() throws SQLException {

        String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
    
        Statement st = null;
    
        try {
    
            st = conn.createStatement();
    
            ResultSet rs = st.executeQuery(sql);
    
            List<Categoria> categories = new LinkedList<>();
    
            while (rs.next()) {
    
                int bdId = rs.getInt("id");
    
                String nom = rs.getString("nom");
    
                Categoria categoria = new Categoria(bdId, nom);
    
                categories.add(categoria);
    
            }
    
            rs.close();
    
            return categories;
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    
    }

    public void creaTaulaAnimals()throws SQLException {
        String sql = "drop table if exists  animals ;"+"CREATE TABLE  animals (" +
    
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
    
                     "       nom       VARCHAR(40))";
    
        Statement st = null;
    
        try {
            creaTaulaCategories();
    
            st = conn.createStatement();
    
            st.executeUpdate(sql);
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    }
    public void eliminaTaulaAnimals()throws SQLException {
        String sql = "drop TABLE if exists ANIMALS;";
    
        Statement st = null;
    
        try {
    
            st = conn.createStatement();
    
            st.executeUpdate(sql);
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    }
    /* retorna el nom de les taules definides a la bd */

    public String getNomTaules() throws SQLException {

        String sql = "SELECT name FROM sqlite_schema " +

                    "WHERE name NOT LIKE 'sqlite%' " +

                    "ORDER BY name";

        List<String> taules = new ArrayList<>();

        try (Statement st = conn.createStatement()) {

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) { taules.add(rs.getString("name")); }

            rs.close();

        }

        return taules.size() > 0 ? String.join(", ", taules) : "cap";

    }
}