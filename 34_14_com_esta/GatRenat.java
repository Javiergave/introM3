//Aquest programa és una representació d'un ascensor
public class GatRenat{ 
    private int vides = 7;
    private String posicio = "estirat";

    public boolean estaDret() {  
        return posicio.equals("dret");
    }
    public boolean estaAssegut() {
        return posicio.equals("assegut");
    }
    public boolean estaEstirat() {
        return posicio.equals("estirat");
    }
    public boolean estaViu() {
        return vides>0;
    }
    public String getPosicio(){
        return posicio;
    }
    public int getVides(){
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
