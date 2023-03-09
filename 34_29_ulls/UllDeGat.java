/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
/*Funcions i característiques dels ulls d'un gat */
public class UllDeGat{
    public UllDeGat ull;
    public String estat="tancat";

    public UllDeGat(){
        estat = "tancat";
    }
    public UllDeGat(boolean obert){
        if(obert){
            estat="obert";
        }
        else{
            estat = "tancat";
        }
    }

    public boolean estaObert(){
        if(this.estat.equals("tancat")){
            return false;
        }
        return true;
    }
    public void obret(){
        if (!this.estat.equals("obert")){
            this.estat="obert";
        }
    }
    public void tancat(){
        if (!this.estat.equals("tancat")){
            this.estat="tancat";
        }
    }  
}