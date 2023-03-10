/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest és el gat Renat, te vides i és a una posicio
class Gat{
    private int vides = 7;
    private String posicio = "estirat";

    public String getPosicio() {  
        return posicio;
    }
    public int getVides() {
        return vides;
    }
    public void setVides(int novesVides){
        if(novesVides>=0){
            vides=novesVides;
        }
    }
    public void setPosicio(String novaPosicio) {
        if(novaPosicio.equals("dret")||novaPosicio.equals("assegut")||novaPosicio.equals("estirat")){
            posicio=novaPosicio;
        }
    }
}
public class GatRenat extends Gat{ 

    public GatRenat(int vides,String posicio) {

        setVides(vides);
        setPosicio(posicio);

    }

    public GatRenat(int novesVides) {

        setVides(novesVides);

    }
    public GatRenat(String novaPosicio) {

        setPosicio(novaPosicio);

    }
    public GatRenat() {

        setVides(7);
        setPosicio("estirat");

    }

    public String aixecat(){
        if(!posicio.equals("dret")){
            setPosicio("dret");
            return ("m'aixeco"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String seu(){
        if(!posicio.equals("assegut")){
            setPosicio("assegut");
            return ("m'assec"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String estirat(){
        if(!posicio.equals("estirat")){
            setPosicio("estirat");
            return ("m'estiro"); 
        }
        else{
            return ("no faig res"); 
        }
    }

    public boolean estaDret() {  
        return posicio.equals("dret");
    }
    public boolean estaAssegut() {
        return posicio.equals("assegut");
    }
    public boolean estaEstirat() {
        return posicio.equals("estirat");
    }
    public boolean estaViu() {
        return vides>0;
    }
    
}
