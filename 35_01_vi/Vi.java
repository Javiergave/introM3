public class Vi { 
    private final String nom;
    private int preu;
    private int estoc;
    public Vi(String preNom,int prePreu){
        nom=normalitzaNom(preNom);
        if(prePreu<0){
            preu=-1;
        }
        else{
            setPreu(prePreu);
        }
        setEstoc(0);
    }
    public Vi(String preNom,int prePreu,int prEstoc){
        nom=normalitzaNom(preNom);
        if(prePreu<0){
            preu=-1;
        }
        else{
            setPreu(prePreu);
        }
        if(prEstoc>=0){
            setEstoc(prEstoc);
        }else{ 
            estoc=-1;
        }
    }
    public static String normalitzaNom(String preNom){
        if(preNom.isBlank()||preNom.isEmpty()){return "NOM NO VÀLID!";}
        String nomFiltrat="";
        preNom=preNom.trim();
        for(int i=0;i<preNom.length();i++){
            if(i>0&&Character.isWhitespace(preNom.charAt(i))&&Character.isWhitespace(preNom.charAt(i-1))){
                continue;
            }else{
                nomFiltrat=nomFiltrat+preNom.charAt(i);
            }
        }
        return nomFiltrat;
    }
    public void setEstoc(int prestoc){
        if(prestoc>=0){
            this.estoc=prestoc;
        }
    }
    public void setPreu(int newPreu){
        if (newPreu>=0){
            this.preu=newPreu;
        }
    }
    public String getNom(){return nom;}
    public int getPreu(){return preu;}
    public int getEstoc(){return estoc;}

    public boolean esValid(){
        if(nom.equals("NOM NO VÀLID!")||estoc<0||preu<0){
            return false;
        }
        return true;
    }
    @Override public String toString(){
        return String.format("""

                Vi: %s
                Preu: %d
                Estoc: %d

            """,nom,preu,estoc);
    }
}