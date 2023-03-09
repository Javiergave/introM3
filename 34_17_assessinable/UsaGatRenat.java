/*
 * Mata el gat Renat 3 cops
 * - el primers amb totes les vides
 * - el segon amb una sola vida
 * - el tercer amb dos vides
 * Després de matar-lo "del tot" prova un altre cop… per si de cas
 * Finalment el gat Renat acaba tenint tres vides però no les
 * pot aprofitar gaire pequè el programa s'acaba.
 */
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        for (int vides = 1; vides <= 3; vides++) {
            while (renat.estaViu()) {
                System.out.println("Renat diu: " + renat.mor());
            }
            System.out.println("Renat diu: " + renat.mor());    // per rematar-ho!
            System.out.println("Renat diu: " + renat.resuscita(vides));
        }
    }
}

