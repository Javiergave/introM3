import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
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
    
            st = conn.createStatement();
    
            st.executeUpdate(sql);
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    }
    public Categoria obteCategoriaPerNom(String nom) throws SQLException{
        String sql = "select * from categoria where nom="+nom+";";
        Statement st = null;
        try {
    
            st = conn.createStatement();
    
            ResultSet rs = st.executeQuery(sql);

            int id = rs.getInt("id");
            String nomcat = rs.getString("nom");
            rs.close();
            return new Categoria(id,nomcat);
    
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
}