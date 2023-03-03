//Aquest és el gat Renat, te vides i és a una posicio
/* */
public class GatRenat {

    private int vides = 7;
    private String posicio = "estirat";
    public GatRenat(int novesVides,String novaPosicio) {

        setVides(novesVides);
        setPosicio(novaPosicio);

    }
    public GatRenat(int novesVides) {

        setVides(novesVides);

    }
    public GatRenat(String novaPosicio) {

        setPosicio(novaPosicio);

    }
    public GatRenat() {

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

    public void setPosicio(String posicio) { 

        if (posicio.equals("dret")||posicio.equals("assegut")||posicio.equals("estirat"))  {

            this.posicio = posicio;

        }

    }
    
    public String toString() { return String.format("Vides: %d. Posició: %s", vides,posicio); }

    public static void main(String[] args) {

        GatRenat[] renats = {
    
            new GatRenat(),         // tot per defecte
    
            new GatRenat(8),        // 8 vides i posició per defecte
    
            new GatRenat("dret"),   // posició dret i vides per defecte
    
            new GatRenat(8, "dret") // 8 vides i posició dret
    
    
        };
    
        for (GatRenat renat: renats) {
    
            System.out.println(renat);
    
        }
    
    }
}