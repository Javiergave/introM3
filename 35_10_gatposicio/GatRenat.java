
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

    public GatRenat(GatPosicio pos){
        setPosicio(pos);
    }
    public GatRenat(String pos){
        setPosicio(pos);
    }

    public GatPosicio getPosicio() {  
        return this.posicio;
    }
    public void setPosicio(GatPosicio pos){
        posicio = pos;
    }
    public void setPosicio(String novaPosicio) {
        if(novaPosicio.equals("dret")||novaPosicio.equals("assegut")||novaPosicio.equals("estirat")){
            posicio=GatPosicio.fromString(novaPosicio);
        }
    }
}
