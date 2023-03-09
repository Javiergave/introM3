/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
/*Aquest programa permet utilitzar a Renat */
//
public class UsaGatRenat {
    public static void main(String[] args) {  
        GatRenat renat = new GatRenat();

        System.out.println("Inicialment renat.estaViu(): " + renat.estaViu());

        System.out.println("Inicialment renat.estaDret(): " + renat.estaDret());

        System.out.println("Inicialment renat.estaAssegut(): " + renat.estaAssegut());

        System.out.println("Inicialment renat.estaEstirat(): " + renat.estaEstirat());

        System.out.println("Introdueix quantes vides:");

        renat.setVides(Integer.parseInt(Entrada.readLine()));

        System.out.println("Introdueix nova posició:");

        renat.setPosicio(Entrada.readLine());

        System.out.println("Finalment renat.estaViu(): " + renat.estaViu());

        System.out.println("Finalment renat.estaDret(): " + renat.estaDret());

        System.out.println("Finalment renat.estaAssegut(): " + renat.estaAssegut());

        System.out.println("Finalment renat.estaEstirat(): " + renat.estaEstirat());
    }
    
}
