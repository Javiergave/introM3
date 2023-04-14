 
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest es l'enum de posicions del gat renat
public enum GatPosicio{
    DRET,
    ESTIRAT,
    ASSEGUT;


    public static GatPosicio fromString(String text){
        if(text.equals("dret")){
            return GatPosicio.DRET;
        }
        else if(text.equals("estirat")){
            return GatPosicio.ESTIRAT;
        }
        else{
            return GatPosicio.ASSEGUT;
        }
    }
}