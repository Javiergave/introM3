/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta classe complementa el programa UsaZoo i la clase Categoria
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;

import javax.xml.catalog.CatalogException;

public class Zoo {

    private static final String NOM_BASE_DE_DADES = "animals.bd";

    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
    NOM_BASE_DE_DADES +
    "?integrity_check&foreign_key_check";

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
        String sql = "drop table if exists  ANIMALS ;"+"CREATE TABLE  ANIMALS (" +
    
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
    
                     "       nom       VARCHAR(40),"+
                     "       categoria INTEGER,"+
                     "FOREIGN KEY(categoria) REFERENCES CATEGORIES(id))";
    
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

    public void afegeixAnimal(Animal ani) throws SQLException{

        if(ani.idIndefinit()==false){
            return;
        }
        int ida=-1;
        String sql = "select id from ANIMALS where nom='"+ani.getNom()+"' ORDER BY id limit 1;";
        String insert = "insert into ANIMALS(id,nom,categoria) values("+ida+","+ani.getNom()+","+ani.getCategoria()+");";
        Statement st = null;

        if(ani.getCategoria().idIndefinit()){
            if(obteCategoriaPerNom(ani.getCategoria().getNom())==null){
                afegeixCategoria(ani.getCategoria());
            }
            ida= (obteCategoriaPerNom(ani.getCategoria().getNom()).getId());

        }
        try {

            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int id = rs.getInt("id");
            rs.close();
            

            
        } finally {

            if (st != null) {

                st.close();

            }

        }
    } 

    public Animal obteAnimalPerNom(String nom) throws SQLException{
        String sql = "SELECT ANIMALS.id as id_animal,"+
        "CATEGORIES.nom as nom_categoria"+
 "FROM ANIMALS, CATEGORIES"+
 "WHERE ANIMALS.categoria = CATEGORIES.id"+
 "ORDER BY ANIMALS.nom limit 1;";
        Statement st = null;
        try {

            st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                return null;
            }
            rs.next();
            int id = rs.getInt("id");
            Categoria cat = obteCategoriaPerNom(rs.getString("nom_categoria"));
            rs.close();
            if(id<1){
                return null;
            }
            return new Animal(id,nom,cat);

        } finally {

            if (st != null) {

                st.close();

            }

        }
    }

    public List<Animal> recuperaAnimals() throws SQLException {

        String sql = "SELECT animals.nom as ani_nom,animals.id as id_ani,categoria.nom as cat_nom FROM ANIMALS,CATEGORIES WHERE animal.categoria=categoria.id ORDER BY nom";
    
        Statement st = null;
    
        try {
    
            st = conn.createStatement();
    
            ResultSet rs = st.executeQuery(sql);
    
            List<Animal> anis = new LinkedList<>();
    
            while (rs.next()) {
    
                int bdId = rs.getInt("id_ani");
    
                String nom = rs.getString("ani_nom");

                String nomcat = rs.getString("cat_nom");
    
                Animal ani = new Animal(bdId, nom,obteCategoriaPerNom(nomcat));
    
                anis.add(ani);
    
            }
    
            rs.close();
    
            return anis;
    
        } finally {
    
            if (st != null) {
    
                st.close();
    
            }
    
        }
    
    }
}