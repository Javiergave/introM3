/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */

//Aquest es el Gat Renat, te més funcions que un gat normal
public class GatRenat extends Gat{ 

    public GatRenat(int vides,String posicio) {

        super.setVides(vides);
        super.setPosicio(posicio);

    }

    public GatRenat(int novesVides) {

        super.setVides(novesVides);

    }
    public GatRenat(String novaPosicio) {

        super.setPosicio(novaPosicio);

    }
    public GatRenat() {

        super.setVides(7);
        super.setPosicio("estirat");

    }

    public String aixecat(){
        if(!super.getPosicio().equals("dret")){
            super.setPosicio("dret");
            return ("m'aixeco"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String seu(){
        if(!super.getPosicio().equals("assegut")){
            super.setPosicio("assegut");
            return ("m'assec"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String estirat(){
        if(!super.getPosicio().equals("estirat")){
            super.setPosicio("estirat");
            return ("m'estiro"); 
        }
        else{
            return ("no faig res"); 
        }
    }

    public boolean estaDret() {  
        return super.getPosicio().equals("dret");
    }
    public boolean estaAssegut() {
        return super.getPosicio().equals("assegut");
    }
    public boolean estaEstirat() {
        return super.getPosicio().equals("estirat");
    }
    public boolean estaViu() {
        return super.getVides()>0;
    }
    
}
