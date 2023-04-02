/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa actua com una botiga de vins amb un espai maxim
// i una quantitat de vins determinada
public class Botiga {
    private final int DEFAULT_MAX_VINS=10;
    private Vi[] vins; 

    public Botiga(){
        vins=new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins){
        if(maxVins<1){
            vins=new Vi[DEFAULT_MAX_VINS];
        }
        else{
            vins=new Vi[maxVins];
        }
    }

    public Vi afegeix(Vi nouVi){
        if(nouVi.esValid()){
            for(int i=0;i<vins.length;i++){
                if(vins[i]!=null){
                    if(nouVi.getNom().equals(vins[i].getNom())){
                        return null;
                    }
                }
            }
            for(int i=0;i<vins.length;i++){
                if(vins[i]==null){
                    vins[i]=nouVi;
                    return vins[i];
                }
            }
        }
        return null;
    }

    public Vi elimina(String aEliminar){
        aEliminar=Vi.normalitzaNom(aEliminar);
        for(int i=0;i<vins.length;i++){
            if(vins[i]!=null){
                if(vins[i].getNom().equals(aEliminar)){
                    if(vins[i].getEstoc()<=0){
                        Vi eliminat=vins[i];
                        vins[i]=null;
                        return eliminat;
                    }
                }
            }     
        }
        return null;
    }

    public Vi cerca(String aTrobar){
        aTrobar=Vi.normalitzaNom(aTrobar.toLowerCase());
        for(int i=0;i<vins.length;i++){
            if(vins[i]!=null){
                if(vins[i].getNom().toLowerCase().equals(aTrobar)){
                    return vins[i];
                }
            }
        }
        return null;
    }
}

