
/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa comprova la funcionalitat de les classes lloguer,vehicle i client
public class GestorLite {
    public static void main(String[] args) {
        Client demo = creaClientDemo();
        mostraClient(demo);
    }
    public static Client creaClientDemo(){
        return new Client("12345","Juan","34253243");
    }
    public static void mostraClient(Client c){
        System.out.println("Client: "+c.getNom());
        System.out.println("        "+c.getNif());
        System.out.println("        "+c.getTelefon());   
        System.out.println("Lloguers: "+c.getLloguers()); 
    }
}
