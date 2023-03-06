//Aquest és el gat Renat, te vides i és a una posicio
/* */
public class GatRenat {
    private static GatRenat renat;
    private int vides = 7;
    private String posicio = "estirat";
    private UllDeGat dret;
    private UllDeGat esquerre;

    

    public UllDeGat getUllEsquerre(){
        if(this.esquerre==null){
            return this.esquerre = new UllDeGat();
        }
        UllDeGat copia = this.esquerre;

        return copia;
    }

    public UllDeGat getUllDret(){
        if(this.dret==null){
            return this.dret = new UllDeGat();
        }
        UllDeGat copia = this.dret;
        return copia;
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

        GatRenat renat = new GatRenat();
    
        UllDeGat dret = renat.getUllDret();
    
        UllDeGat esquerre = renat.getUllEsquerre();
    
        System.out.printf("Quan està %s: %b + %b%n",
    
                renat.getPosicio(),
    
                renat.getUllDret().estaObert(),
    
                renat.getUllEsquerre().estaObert());
    
        renat.seu();
    
        System.out.printf("Quan està %s: %b + %b%n",
    
                renat.getPosicio(),
    
                renat.getUllDret().estaObert(),
    
                renat.getUllEsquerre().estaObert());
    
        renat.aixecat();
    
        System.out.printf("Quan està %s: %b + %b%n",
    
                renat.getPosicio(),
    
                renat.getUllDret().estaObert(),
    
                renat.getUllEsquerre().estaObert());
    
    }
}
