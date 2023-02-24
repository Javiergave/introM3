//Aquest és el gat Renat, te vides i és a una posicio
public class GatRenat {
    private static GatRenat instancia;
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia(){
        return instancia = new GatRenat();
    }
    public static GatRenat getInstancia(){
        if(instancia==null){
            return instancia = new GatRenat();
        }
        return instancia;
    }
    public static GatRenat getInstancia(int vides){
        if(instancia==null){
            instancia = new GatRenat(vides);
            return instancia;
        }
        instancia.setVides(vides);
        return instancia;
    }
    public static GatRenat getInstancia(String posicio){
        if(instancia==null){
            return instancia = new GatRenat(posicio);
        }
        instancia.setPosicio(posicio);
        return instancia;
    }
    public static GatRenat getInstancia(int vides,String posicio){
        if(instancia==null){
            return instancia = new GatRenat(vides,posicio);
        }
        instancia.setPosicio(posicio);
        instancia.setVides(vides);
        return instancia; 
    }
    private GatRenat(int vides,String posicio) {

        setVides(vides);
        setPosicio(posicio);

    }

    private GatRenat(int novesVides) {

        setVides(novesVides);

    }
    private GatRenat(String novaPosicio) {

        setPosicio(novaPosicio);

    }
    private GatRenat() {

        setVides(vides);
        setPosicio(posicio);

    }
    

    private int getVides() { return vides; }

    private void setVides(int novesVides) { 

        if (novesVides >= 0)  {

            this.vides = novesVides;

        }

    }

    public String getPosicio() { return posicio; }

    private void setPosicio(String novaPosicio) { 

        if (novaPosicio.equals("dret")||novaPosicio.equals("assegut")||novaPosicio.equals("estirat"))  {

            this.posicio = novaPosicio;

        }

    }

}