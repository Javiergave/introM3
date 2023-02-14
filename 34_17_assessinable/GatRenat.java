import javax.sql.StatementEventListener;

//Aquest programa és una representació d'un ascensor
public class GatRenat{ 
    private int vides = 7;
    private String posicio = "estirat";

    public String mor(){

        if(vides-1>0){
            setVides(vides-1);
            return ("auch");
        }
        if(vides-1==0){
            setVides(vides-1);
            return ("ximpún");
        }
        return "...";
    }
    public String resuscita(){
        if(vides==0){
            setVides(1);
            return ("guai!");
        }
        return ("...");
    }
    public String resuscita(int novesVides){
        if(vides==0){
            if(novesVides<1){
                return ("...");
            }
            setVides(novesVides);
            return ("guai!");
        }
        return ("...");
    }

    public String aixecat(){
        if(!posicio.equals("dret")){
            setPosicio("dret");
            return ("m'aixeco"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String seu(){
        if(!posicio.equals("assegut")){
            setPosicio("assegut");
            return ("m'assec"); 
        }
        else{
            return ("no faig res"); 
        }
    }
    public String estirat(){
        if(!posicio.equals("estirat")){
            setPosicio("estirat");
            return ("m'estiro"); 
        }
        else{
            return ("no faig res"); 
        }
    }

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
