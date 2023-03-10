/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */

//Aquest es el Gat Renat, te més funcions que un gat normal
public class GatRenat extends Gat{ 
    
    public GatRenat() {

        setVides(7);
        setPosicio("estirat");

    }

    public String aixecat(){
        if(!estaDret()){
            this.setPosicio("dret");
            return ("m'aixeco"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String seu(){
        if(!estaAssegut()){
            this.setPosicio("assegut");
            return ("m'assec"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String estirat(){
        if(!estaEstirat()){
            this.setPosicio("estirat");
            return ("m'estiro"); 
        }
        else{
            return ("no faig res"); 
        }
    }

    public boolean estaDret() {  
        return getPosicio().equals("dret");
    }
    public boolean estaAssegut() {
        return getPosicio().equals("assegut");
    }
    public boolean estaEstirat() {
        return getPosicio().equals("estirat");
    }
    public boolean estaViu() {
        return getVides()>0;
    }
    
}
