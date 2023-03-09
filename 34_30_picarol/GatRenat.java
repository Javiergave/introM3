/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest és el gat Renat, te vides i un picarol i és a una posicio
public class GatRenat {
    private static GatRenat renat;
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol = null;

    public boolean tePicarol(){
        if(this.picarol!=null){
            return true;
        }
        return false;
    }

    public Picarol posaPicarol(Picarol picarol1){
        Picarol antic = this.picarol;
        if(picarol1==null){ 
            return antic;
        }
        if(this.picarol==null){
            picarol = picarol1;
            return null;
        }
        this.picarol = picarol1;
        return antic;
    }

    public Picarol treuPicarol(){
        Picarol antic = this.picarol;
        this.picarol=null;
        return antic;
    }
    
    public String aixecat(){
        this.setPosicio("dret");
        if(this.tePicarol()){
        }
        return this.getPosicio();
    }
    public String seu(){
        this.setPosicio("assegut");
        if(this.tePicarol()){
        }
        return this.getPosicio();
    }
    public String estirat(){
        this.setPosicio("estirat");
        if(this.tePicarol()){
        }
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

            if (!getPosicio().equals(novaPosicio) && picarol!=null){
                picarol.sona();
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
