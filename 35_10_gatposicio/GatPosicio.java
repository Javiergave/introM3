 
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


    public static GatPosicio fromString(String text)throws IllegalArgumentException{
        if(text.equalsIgnoreCase("dret")){
            return GatPosicio.DRET;
        }
        else if(text.equalsIgnoreCase("estirat")){
            return GatPosicio.ESTIRAT;
        }
        else if(text.equalsIgnoreCase("assegut")){
            return GatPosicio.ASSEGUT;
        }
        throw new IllegalArgumentException("Valor \""+text+"\" no suportat per GatPosicio");
    }
}