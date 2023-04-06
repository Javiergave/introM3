/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa actua com un vi, amb nom preu i estoc
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

    public String[] aArrayString(){
        String[] valorsVi= new String[3];

        valorsVi[0] = this.getNom()+";";
        valorsVi[1] = String.valueOf(this.getPreu())+";";
        valorsVi[2] = String.valueOf(this.getEstoc())+"\n";
        
        return valorsVi;
    }

    public static Vi deArrayString(String[] vins){
        String nomvi=vins[0];
        String preuvi=vins[1];
        String estocvi=vins[2];

        if(UtilString.esEnter(preuvi)){
            int preuint= Integer.parseInt(preuvi);
            if(UtilString.esEnter(estocvi)){
                int estocint= Integer.parseInt(estocvi);
                nomvi=normalitzaNom(nomvi);
                return new Vi(nomvi,preuint,estocint);
            }
        }
        return null;
    }
}