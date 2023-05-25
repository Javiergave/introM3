/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa conté utilitats fetes servir per la classe Zoo
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;
public class ZooUtils{
    private Connection conn = null;

    public static void mostraCategories(List<Categoria> cats) throws SQLException {
        if(cats.size()<1){
            System.out.println("Cap categoria"); 
        }
        else{
            System.out.println("Nombre de categories: "+cats.size()); 
            for (Categoria c : cats){
                System.out.println("\t"+c.toString()); 
            } 
        }

    }

    public static void mostraAnimals(List<Animal> anis) throws SQLException {
        if(anis.size()<1){
            System.out.println("Cap animal"); 
        }
        else{
            System.out.println("Nombre de animals: "+anis.size()); 
            for (Animal a : anis){
                System.out.println("\t"+a.toString()); 
            } 
        }

    }
}