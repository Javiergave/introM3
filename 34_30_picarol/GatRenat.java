//Aquest és el gat Renat, te vides i és a una posicio
/* */
public class GatRenat {
    private static GatRenat renat;
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol = null;

    public boolean tePicarol(){
        if(picarol!=null){
            return true;
        }
        return false;
    }

    public Picarol posaPicarol(Picarol picarol){
        if(picarol==null){
            return picarol = new Picarol();
        }
        return null;
    }

    public Picarol treuPicarol(){
        if(this.picarol!=null){
            this.picarol=null;
            return picarol;
        }

        return picarol;
    }
    
    public String aixecat(){
        this.setPosicio("dret");
        
        return this.getPosicio();
    }
    public String seu(){
        this.setPosicio("assegut");
        
        return this.getPosicio();
    }
    public String estirat(){
        this.setPosicio("estirat");
        
        return this.getPosicio();
    }
    
    
    

    private static GatRenat renat(){
        return renat = new GatRenat();
    }
    public static GatRenat getrenat(){
        if(renat==null){
            return renat = new GatRenat();
        }
        return renat;
    }
    public static GatRenat getrenat(int vides){
        if(renat==null){
            renat = new GatRenat(vides);
            return renat;
        }
        renat.setVides(vides);
        return renat;
    }
    public static GatRenat getrenat(String posicio){
        if(renat==null){
            return renat = new GatRenat(posicio);
        }
        renat.setPosicio(posicio);
        return renat;
    }
    public static GatRenat getrenat(int vides,String posicio){
        if(renat==null){
            return renat = new GatRenat(vides,posicio);
        }
        renat.setPosicio(posicio);
        renat.setVides(vides);
        return renat; 
    }
    public GatRenat(int vides,String posicio) {

        setVides(vides);
        setPosicio(posicio);

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

    public void setPosicio(String novaPosicio) { 

        if (novaPosicio.equals("dret")||novaPosicio.equals("assegut")||novaPosicio.equals("estirat"))  {

            if (novaPosicio.equals("dret")){

            }
            this.posicio = novaPosicio;

        }

    }
       

    public static void main(String[] args) {

    Picarol picarol = new Picarol();

    picarol.sona();   // el picarol funciona fins i tot sense gat!

    GatRenat renat = new GatRenat();

    renat.aixecat();

    renat.posaPicarol(picarol);

    renat.seu();      // ha de sonar el picarol

    renat.seu();      // no sona el picarol doncs no es mou!

    renat.treuPicarol();

    renat.estirat();  // no sona el picarol doncs ja no el té

    System.out.println("Nombre de cops que sona el picarol: " + picarol.quantsCops());

}
}
