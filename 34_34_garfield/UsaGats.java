/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa testeja les classes Gat,GatRenat i Garfield
public class UsaGats {
    public static void main(String[] args) {

        Gat[] gats = new Gat[] {
    
            new Gat("Misifú"),
    
            new GatRenat(),
    
            new Garfield()
    
        };
    
        for (Gat gat: gats) {
    
            System.out.println("Entrenant el gat " + gat.getNom());
    
            System.out.println(gat.getNom() + " diu: "+ gat.seu());
    
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
    
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
    
            System.out.println(gat.getNom() + " diu: "+ gat.estirat());
    
            System.out.println();
    
        }
    
    }
}
