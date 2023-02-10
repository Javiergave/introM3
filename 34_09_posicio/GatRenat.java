import javax.swing.text.Position;

//Aquest programa és una representació d'un ascensor
public class GatRenat{ 
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
