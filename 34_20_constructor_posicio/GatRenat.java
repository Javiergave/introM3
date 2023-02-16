//Aquest és el gat Renat, te vides i és a una posicio
public class GatRenat {

    private int vides;
    private String posicio="estirat";
    public GatRenat() {

        vides = 7;

    }

    @Override

    public String toString() {

        return String.format("Vides: %d. Posició: %s", vides,posicio);

    }

    public int getVides() { return vides; }

    public static void main(String[] args) {

        GatRenat renat = new GatRenat();

        System.out.println(renat);

    }

} 

