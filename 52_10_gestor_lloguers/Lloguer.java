
/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta clase és un lloguer d'un vehicle que té un client
public class Lloguer {
    private int dies;
    private Vehicle cotxe;
    public Lloguer(int dia,Vehicle v){
        dies=dia;
        cotxe=v;
    }

    public int getDies(){ return dies;  }
    public void setDies(int q){  dies = q;  }
}
