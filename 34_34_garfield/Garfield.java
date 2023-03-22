/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest es el Garfield, neix amb 9 vides i el nombre màxim de vides son 9, sempre neix estirat
public class Garfield extends Gat{
    Garfield (){
        super("Garfield");
        super.setVides(9);

    }
    Garfield (int vides){
        
        super("Garfield");
        setVides(vides);
    }
    

    @Override
    public void setVides(int novesVides){
        if(novesVides<9&novesVides>=0){
            super.setVides(novesVides);
        }
    }
    public String aixecat(){
        if(estaAssegut()){
            setPosicio("dret");
            return ("m'aixeco"); 
        }
        else if(estaEstirat()){
            return ("Bai Maitea, bai"); 
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
        if(estaAssegut()){
            this.setPosicio("estirat");
            return ("m'estiro"); 
        }
        else if(estaDret()){
            return ("Bai Maitea, bai"); 
        }
        else{
            return("no faig res");
        }
    }
}
