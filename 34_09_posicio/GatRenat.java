//Aquest objecte és el gat Renat
/* */
public class GatRenat{ 
    public int vides = 7;
    public String posicio = "estirat";
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
