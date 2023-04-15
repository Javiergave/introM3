
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest objecte és el gat Renat, té vides i una posicio

public class GatRenat{ 
    private GatPosicio posicio = GatPosicio.ASSEGUT;

    public GatRenat(){
        posicio=GatPosicio.ESTIRAT;
    }

    public GatRenat(GatPosicio pos){
        if(pos!=posicio){
            posicio=pos;
        }
    }
    public GatRenat(String novaPosicio)throws IllegalArgumentException{
        if(novaPosicio.equalsIgnoreCase("dret")||novaPosicio.equalsIgnoreCase("assegut")||novaPosicio.equalsIgnoreCase("estirat")){
            posicio=GatPosicio.fromString(novaPosicio);
        }
        else{
            throw new IllegalArgumentException("Valor \""+novaPosicio+"\" no suportat per GatPosicio");
        }
    }

    public GatPosicio getPosicio() {  
        return this.posicio;
    }
    public void setPosicio(GatPosicio pos)throws IllegalArgumentException{
        if(pos!=GatPosicio.ASSEGUT||pos!=GatPosicio.DRET||pos!=GatPosicio.ESTIRAT){
            throw new IllegalArgumentException("Valor \""+pos+"\" no suportat per GatPosicio");
        }
        else{
            posicio = pos;
        }
    }
    public void setPosicio(String novaPosicio) throws IllegalArgumentException{
        if(novaPosicio.equalsIgnoreCase("dret")||novaPosicio.equalsIgnoreCase("assegut")||novaPosicio.equalsIgnoreCase("estirat")){
            posicio=GatPosicio.fromString(novaPosicio);
        }
        else{
            throw new IllegalArgumentException("Valor \""+novaPosicio+"\" no suportat per GatPosicio");
        }
    }
}
