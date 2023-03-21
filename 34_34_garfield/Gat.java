/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */

//Aquest és un gat, te vides i és a una posicio
public class Gat{
    private int vides = 7;
    private String posicio = "estirat";
    private final String NOM;

    public String getNom(){ return NOM; }
    public String getPosicio() { return posicio; }
    public int getVides() { return vides; }

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
        return (getVides()>0);
    }

    public Gat(String newNom,int novesVides,String novaPosicio) {

        
        setVides(novesVides);
        setPosicio(novaPosicio);
        if(newNom==null){
            NOM="anònim";
            return;
        }
        NOM=newNom;

    }
    public Gat(String newNom,int novesVides) {

        setVides(novesVides);
        if(newNom==null){
            NOM="anònim";
            return;
        }
        NOM=newNom;

    }
    public Gat(String newNom,String novaPosicio) {

        setPosicio(novaPosicio);
        if(newNom==null){
            NOM="anònim";
            return;
        }
        NOM=newNom;

    }

    public Gat(String newNom) {
        if(newNom==null){
            NOM="anònim";
            return;
        }
        NOM=newNom;
    }
}
