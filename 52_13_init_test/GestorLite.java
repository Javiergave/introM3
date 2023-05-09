
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
        
        System.out.println(demo.getLloguers().size()); 
        mostraClient(demo);
    }
    public static Client creaClientDemo(){
        Client c =new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        c.setLloguers(new Lloguer(new Vehicle("Seat", "600", 1), 2));
        c.setLloguers(new Lloguer(new Vehicle("Tata", "Vista", 2), 5));
        c.setLloguers(new Lloguer(new Vehicle("Fiat", "Uno", 3), 3));
        return c;
    }  
    public static void mostraClient(Client c){
        System.out.println("Client: "+c.getNom());
        System.out.println("        "+c.getNif());
        System.out.println("        "+c.getTelefon());   
        System.out.println("Lloguers: "+c.getLloguers().size()); 
        for (int i = 0; i<c.getLloguers().size();i++){
            System.out.println("        "+(i+1)+". vehicle: "+c.getLloguers().get(i).getVehicle().getMarca()+" "+c.getLloguers().get(i).getVehicle().getModel()); 
            System.out.println("           dies llogats: "+c.getLloguers().get(i).getDies()); 
        }
    }
}
