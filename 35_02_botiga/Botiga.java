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
    private Vi[] vi; 

    public Botiga(){
        vi=new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins){
        if(maxVins<1){
            vi=new Vi[DEFAULT_MAX_VINS];
        }
        else{
            vi=new Vi[maxVins];
        }
    }

    public Vi afegeix(Vi nouVi){
        if(nouVi.esValid()){
            for(int i=0;i<=vi.length();i++){
                if(nouVi.getNom().equals(vi[i].getNom())){
                    return null;
                }
            }
            for(int i=0;i<=vi.length()){
                if(vi[i]==null){
                    vi[i]=nouVi;
                    return vi[i];
                }
            }
        }
        return null;
    }

    public Vi elimina(String aEliminar){
        aEliminar=Vi.normalitzaNom(aEliminar);
        for(int i=0;i<=vi.length();i++){
            
        }
    }
}

