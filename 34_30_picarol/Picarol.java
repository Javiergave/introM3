/* Aquest és el Picarol del Gat Renat, fa clink-clink una quantitat de cops determinada
 *
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
public class Picarol{
    public Picarol Picarol;
    private int cops=0 ;

    public Picarol(){

    }
    public void sona(){
        cops+=1;

        for(int i = 0; i<cops;i++){
            System.out.println("clink-clink"); 
            
        }
        
        
    }

    public int quantsCops(){
        return cops;
    }  
}