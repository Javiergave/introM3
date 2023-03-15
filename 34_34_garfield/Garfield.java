/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest es el Garfield, neix amb 9 vides i el nombre màxim de vides son 9, sempre neix estirat
public class Garfield extends Gat{
    public Garfield (){
        super.Gat("Garfield");
        setVides(9);
    }
    public Garfield (int vides){
        super.Gat("Garfield");
        setVides(vides);
    }

    @Override
    public void setVides(novesVides){
        if(novesVides<9&novesVides>=0){
            vides=novesVides;
        }
    }
    public String aixecat(){
        if(!estaDret()){
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
        if(!estaEstirat()||estaAssegut()){
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
