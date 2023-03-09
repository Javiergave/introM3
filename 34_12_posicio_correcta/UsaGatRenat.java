/*Aquest programa permet utilitzar al gat Renat */
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
public class UsaGatRenat {
    public static void main(String[] args) {  
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.getVides());

        System.out.println("Posició inicial: " + renat.getPosicio());

        System.out.println("Introdueix nova posició:"); 

        renat.setPosicio(Entrada.readLine());

        System.out.println("Posició final: " + renat.getPosicio()); 
    }
    
}
