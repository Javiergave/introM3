/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa actua com una botiga de vins amb un espai maxim
// i una quantitat de vins determinada
import java.io.*;
import java.nio.file.FileVisitResult;
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

    public Vi afegeix(Vi nouVi) throws IOException{
        FileWriter file = new FileWriter("botiga.csv",true);
        BufferedWriter botigacsv= new BufferedWriter(file);
        FileReader boti = new FileReader("botiga.csv");
        BufferedReader read = new BufferedReader(boti);
        if(nouVi.esValid()){
            if(cerca(nouVi.getNom())==null){  
                    String[] text = new String[3];
                    text = nouVi.aArrayString();
                    int lin=0;
                    while (true){
                        String linia = read.readLine();
                        if(linia==null){
                            lin=0;
                            break;
                        }
                        else{
                            lin++;
                        }
                    }
                    boti.close();
                    read.close();
                    if(lin>0){
                        botigacsv.write("\n"+text[0]+text[1]+text[2]);
                        botigacsv.close();
                        file.close();
                    }
                    else{
                        botigacsv.write(text[0]+text[1]+text[2]);
                        botigacsv.close();
                        file.close();
                    }
                    for(int i = 0; i<vins.length;i++){
                        if(vins[i]==null){
                            vins[i] = nouVi;
                        }
                    }
                    return nouVi;
                }   
            }
            int lin=0;
            while (true){
                String linia = read.readLine();
                if(linia==null){
                    lin=0;
                    break;
                }
                else{
                    lin++;
                }
            }
            boti.close();
            read.close();

            if(lin<1){
                for(int i=0;i<vins.length;i++){
                    if(vins[i]==null){
                        vins[i]=nouVi;
                        botigacsv.write("\n"+vins[i].getNom()+";"+vins[i].getPreu()+";"+vins[i].getEstoc());
                        botigacsv.close();
    
                        return vins[i];
                    }
                }
            }
            else{
                for(int i=0;i<vins.length;i++){
                    if(vins[i]==null){
                        vins[i]=nouVi;
                        botigacsv.write(vins[i].getNom()+";"+vins[i].getPreu()+";"+vins[i].getEstoc());
                        botigacsv.close();
    
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

    public Vi cerca(String aTrobar) throws IOException{
        aTrobar = Vi.normalitzaNom(aTrobar);
        FileReader file = new FileReader("botiga.csv");
        BufferedReader botigaCsv= new BufferedReader(file);
        while(true){
            String vi = botigaCsv.readLine();
            if(vi==null){
                botigaCsv.close();
                file.close();
                return null;
            }
            String[] vins = new String[3];
            vins= vi.split(";");
            
            if(Vi.deArrayString(vins).getNom().equals(aTrobar)){
                botigaCsv.close();
                file.close();
                return Vi.deArrayString(vins);
            }
            
        }
    }

    public void iniciaRecorregut() throws IOException{
        File botiga=new File("botiga.csv");
        if(botiga.exists()){
            int referencies=0;
            FileReader file = new FileReader("botiga.csv");
            BufferedReader botigacsv= new BufferedReader(file);
        }
    }

    public Vi getSeguent() throws IOException{
        FileReader file = new FileReader("botiga.csv");
        BufferedReader botigaCsv= new BufferedReader(file);

        String vi = botigaCsv.readLine();
        String[] vins = new String[3];
        vins= vi.split(";");
        botigaCsv.close();
        file.close();
        return Vi.deArrayString(vins);
    }
}

