/*Aquest programa permet utilitzar al gat Renat */
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
public class UsaGatRenat {
    public static void main(String[] args){

        try {

            GatPosicio posicio = GatPosicio.fromString(args[0]);

            GatRenat renat = new GatRenat(posicio);

            System.out.println("El gat Renat està: " + renat.getPosicio());

       } catch (IllegalArgumentException e) {

           System.out.println(e);

       }

    }
    
}
