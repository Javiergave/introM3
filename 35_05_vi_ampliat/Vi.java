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
    private String ref;
    private String lloc;
    private String tipus;
    private String collita;
    private String origen;
    public Vi(String ref1, String nom1,int preu1, int estoc1,String lloc1, String origen1,String tipus1, String collita1){
        nom=normalitzaString(nom1);
        if(preu1<0){
            preu=-1;
        }
        else{
            setPreu(preu1);
        }
        if(estoc1>=0){
            setEstoc(estoc1);
        }else{ 
            estoc=-1;
        }


    }
    
    public static String normalitzaString(String preNom){
        if(preNom.isBlank()||preNom.isEmpty()||preNom==null){return null;}
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
    public void setLloc(String lloc1){
        if(!lloc1.isEmpty()&&!lloc1.isBlank()&&lloc1!=null){
            lloc=lloc1;
        }
    }
    public void setOrigen(String origen1){
        if(!origen1.isEmpty()&&!origen1.isBlank()&&origen1!=null){
            origen=origen1;
        }
    }
    public void setTipus(String tipus1){
        if(!tipus1.isEmpty()&&!tipus1.isBlank()&&tipus1!=null){
            tipus=tipus1;
        }
    }
    public void setCollita(String collita1){
        if(!collita1.isEmpty()&&!collita1.isBlank()&&collita1!=null){
            collita=collita1;
        }
    }
    public String getRef(){return ref;}
    public String getNom(){return nom;}
    public int getPreu(){return preu;}
    public int getEstoc(){return estoc;}
    public String getLloc(){return lloc;}
    public String getOrigen(){return origen;}
    public String getTipus(){return tipus;}
    public String getCollita(){return collita;}


    public boolean esValid(){
        if(nom.equals(null)||estoc<0||preu<0||lloc.equals(null)||collita.equals(null)||origen.equals(null)||tipus.equals(null)){
            return false;
        }
        return true;
    }
    @Override public String toString(){
        return String.format("""
                Ref: %s
                Vi: %s
                Preu: %d
                Estoc: %d
                Lloc: %s
                D.O.: %s
                Tipus: %s
                Collita: %s
            """,ref,nom,preu,estoc,lloc,origen,tipus,collita);
    }

    public String[] aArrayString(){
        String[] valorsVi= new String[8];

        valorsVi[0] = this.getRef()+";";
        valorsVi[1] = this.getNom()+";";
        valorsVi[2] = String.valueOf(this.getPreu())+";";
        valorsVi[3] = String.valueOf(this.getEstoc())+";";
        valorsVi[4] = this.getLloc()+";";
        valorsVi[5] = this.getOrigen()+";";
        valorsVi[6] = this.getTipus()+";";
        valorsVi[7] = this.getCollita()+"\n";

        
        return valorsVi;
    }

    public static Vi deArrayString(String[] vins){
        if(vins.length!=8){return null;}
        if(vins[0]==null){return null;}
        for(int i = 3;i<=7;i++){
            if(vins[i]==null){return null;}
        }
        String refvi=vins[0];
        String nomvi=vins[1];
        String preuvi=vins[2];
        String estocvi=vins[3];
        String llocvi=vins[4];
        String tipusvi=vins[5];
        String collitavi=vins[6];
        String origenvi=vins[7];

        if(UtilString.esEnter(preuvi)){
            int preuint= Integer.parseInt(preuvi);
            if(UtilString.esEnter(estocvi)){
                int estocint= Integer.parseInt(estocvi);
                nomvi=normalitzaString(nomvi);
                llocvi=normalitzaString(llocvi);
                tipusvi=normalitzaString(tipusvi);
                collitavi=normalitzaString(collitavi);
                origenvi=normalitzaString(origenvi);
                refvi=normalitzaString(refvi);
                return new Vi(refvi,nomvi,preuint,estocint,llocvi,origenvi,tipusvi,collitavi);
            }
        }
        return null;
    }
}