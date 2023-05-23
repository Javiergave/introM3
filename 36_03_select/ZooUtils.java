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
            System.out.println("Nombre de catgeories: "+cats.size()); 
            for (Categoria c : cats){
                System.out.println(c.toString()); 
            } 
        }

    }
}