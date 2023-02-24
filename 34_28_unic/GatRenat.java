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
        return new GatRenat();
    }
    public static GatRenat getInstancia(int vides){
        if(instancia==null){
            return instancia = new GatRenat(vides);
        }
        return new GatRenat(vides);
    }
    public static GatRenat getInstancia(String posicio){
        if(instancia==null){
            return instancia = new GatRenat();
        }
        return new GatRenat();
    }
    public static GatRenat getInstancia(int vides,String posicio){
        if(instancia==null){
            return instancia = new GatRenat(vides,posicio);
        }
        return new GatRenat(vides,posicio);
    }
    private GatRenat(int vides,String posicio) {

        setVides(vides);
        setPosicio(posicio);

    }

    public GatRenat(int novesVides) {

        setVides(novesVides);

    }
    public GatRenat(String novaPosicio) {

        setPosicio(novaPosicio);

    }
    private GatRenat() {

        setVides(vides);
        setPosicio(posicio);

    }
    

    public int getVides() { return vides; }

    public void setVides(int novesVides) { 

        if (novesVides >= 0)  {

            this.vides = novesVides;

        }

    }

    public String getPosicio() { return posicio; }

    public void setPosicio(String novaPosicio) { 

        if (novaPosicio.equals("dret")||novaPosicio.equals("assegut")||novaPosicio.equals("estirat"))  {

            this.posicio = novaPosicio;

        }

    }
    

    public String toString() { return String.format("Vides: %d. Posició: %s", vides,posicio); }

}