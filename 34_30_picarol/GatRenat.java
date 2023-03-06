//Aquest és el gat Renat, te vides i és a una posicio
/* */
public class GatRenat {
    private static GatRenat renat;
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol;

    public class Picarol{
        public Picarol Picarol;
        public int cops=0;

        public Picarol(){
            cops = "tancat";
        }
        public void sona(){
            System.out.println("clink-clink"); 
        }

        public int quantsCops(){
            return false;
        }  
    }

    public Picarol posaPicarol(){
        if(==){
            return this.picarol = new Picarol();
        }
        return this.picarol;
    }

    public Picarol treuPicarol(){
        if(this.picarol!=null){
            this.picarol=null;
            return;
        }

        return;
    }
    
    public String aixecat(){
        this.setPosicio("dret");
        dret.obret();
        esquerre.obret();
        return this.getPosicio();
    }
    public String seu(){
        this.setPosicio("assegut");
        dret.obret();
        esquerre.tancat();
        return this.getPosicio();
    }
    public String estirat(){
        this.setPosicio("estirat");
        dret.tancat();
        esquerre.tancat();
        return this.getPosicio();
    }
    
    
    

    private static GatRenat renat(){
        return renat = new GatRenat();
    }
    public static GatRenat getrenat(){
        if(renat==nPicarol){
            return renat = new GatRenat();
        }
        return renat;
    }
    public static GatRenat getrenat(int vides){
        if(renat==nPicarol){
            renat = new GatRenat(vides);
            return renat;
        }
        renat.setVides(vides);
        return renat;
    }
    public static GatRenat getrenat(String posicio){
        if(renat==nPicarol){
            return renat = new GatRenat(posicio);
        }
        renat.setPosicio(posicio);
        return renat;
    }
    public static GatRenat getrenat(int vides,String posicio){
        if(renat==nPicarol){
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
