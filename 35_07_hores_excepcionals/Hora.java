//Un rellotge que es pot incrementar i incrementar la hora
/**

 * Compara dues hores i retorna l'operador corresponent

 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els

 * altres dos valors possibles són ">" i "=="

 * @param hora1: primera hora a comparar

 * @param hora2: segona hora a comparar

 * @return operador resultant

 */
import java.io.*;
public class Hora {
    private int hores=0;
    private int minuts=0;
    private int segons=0;
    public Hora(){

    }
    public Hora(int hora,int minut,int segon) throws Exception{
        if(hora<=23&&hora>=0){
            if(minut<60&&minut>=0){
                if(segon<60&&segon>=0){
                    setHores(hora);
                    setMinuts(minut);
                    setSegons(segon);
                }
            }        
        }  
    }
    public void incrementa()throws Exception{
        if(getSegons()+1>59){
            if(getMinuts()+1>59){
                if(getHores()+1>23){
                    setHores(0);
                }
                else{
                    setHores(getHores()+1);
                }
                setMinuts(0);
            }
            else{
                setMinuts(getMinuts()+1);
            }
            setSegons(0);
        }else{
            setSegons(getSegons()+1);
        }
    }
    public void incrementa(int incrementa)throws Exception{

        if (incrementa<0){
            decrementa(-incrementa);
        }

        int incrementahores = incrementa/3600;
        int incrementaminuts = (incrementa%3600)/60;
        incrementa = incrementa-((incrementahores*3600)+incrementaminuts*60);

        for(int i = incrementa;i>0;i--){
            if(getSegons()+1>59){
                if(getMinuts()+1>59){
                    if(getHores()+1>23){
                        setHores(0);
                        setMinuts(0);
                        setSegons(0);
                    }
                    else{
                        setHores(getHores()+1);
                        setMinuts(0);
                        setSegons(0);
                    }
                }
                else{
                    setMinuts(getMinuts()+1);
                    setSegons(0);
                }
            }
            else{
                setSegons(getSegons()+1);
            }
        }
        for(int i = incrementaminuts;i>0;i--){
            if(getMinuts()+1>59){
                setHores(getHores()+1);
                setMinuts(0);
            }
            else{
                setMinuts(getMinuts()+1);
            }
        }

        for (int i = incrementahores; i>0;i--){
            if (getHores()+1>23){
                setHores(0);
            }
            else{
                setHores(getHores()+1);
            }
        }

    }
    public void decrementa()throws Exception{
        if(getSegons()-1<0){
            if(getMinuts()-1<0){
                if(getHores()-1<0){
                    setHores(23);
                }
                else{
                    setHores(getHores()-1);
                }
                setMinuts(59);
                setSegons(59);
            }
            else{
                setMinuts(getMinuts()-1);
            }
            setSegons(59);
        }else{
            setSegons(getSegons()-1);
        }
    }
    public void decrementa(int decrementa)throws Exception{
        if (decrementa<0){
            incrementa(-decrementa);
        }

        int decrementahores = decrementa/3600;
        int decrementaminuts = (decrementa%3600)/60;
        decrementa = decrementa-((decrementahores*3600)+decrementaminuts*60);

        for(int i = decrementa;i>0;i--){
            if(getSegons()-1<0){
                if(getMinuts()-1<0){
                    if(getHores()-1<0){
                        setHores(23);
                        setMinuts(59);
                        setSegons(59);
                    }
                    else{
                        setHores(getHores()-1);
                        setMinuts(59);
                        setSegons(59);
                    }
                }
                else{
                    setMinuts(getMinuts()-1);
                    setSegons(59);
                }
            }
            else{
                setSegons(getSegons()-1);
            }
        }
        for(int i = decrementaminuts;i>0;i--){
            if(getMinuts()-1<0){
                setHores(getHores()-1);
                setMinuts(59);
            }
            else{
                setMinuts(getMinuts()-1);
            }
        }

        for (int i = decrementahores; i>0;i--){
            if (getHores()-1<0){
                setHores(24-1);
            }
            else{
                setHores(getHores()-1);
            }
        }
        
    }
    public int compareTo(Hora hora){
        int totalHoraEste = this.hores*3600 + this.minuts*60 + this.segons;
        int totalHoraOtro = hora.hores*3600 + hora.minuts*60 + hora.segons;
        if(totalHoraEste<totalHoraOtro){
            return -1;
        }
        else if(totalHoraEste>totalHoraOtro){
            return 1;
        }
        return 0;
    }
    public String toString(){
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
    public int getHores(){
        return hores;
    }
    public int getMinuts(){
        return minuts;
    }
    public int getSegons(){
        return segons;
    }
    public void setHores(int novaHora) throws Exception{

        if(novaHora<=23&&novaHora>=0){
            hores=novaHora;
        }
        throw new Exception("hores fora de rang: «"+novaHora+"»");
    }
    public void setMinuts(int novaMinuts) throws Exception{

        if(novaMinuts<60&&novaMinuts>=0){
            minuts=novaMinuts;
        }
        throw new Exception("minuts fora de rang: «"+novaMinuts+"»");
    }
    public void setSegons(int novaSegons) throws Exception{
        if(novaSegons>=0&&novaSegons<60){
            segons=novaSegons;
        }
        throw new Exception("segons fora de rang: «"+novaSegons+"»");
    }
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {

        int comparacio = hora1.compareTo(hora2);
    
        if (comparacio < 0) {
    
            return "<";
    
        } else if (comparacio > 0) {
    
            return ">";
    
        } else {
    
            return "==";
    
        }
    
    }
    
    
    public static void main(String[] args) throws Exception{
    
        Hora hora1 = new Hora();
    
        Hora hora2 = new Hora(0, 0, 2);
    
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
    
                hora1,
    
                composaOperadorComparacio(hora1, hora2),
    
                hora2);
    
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
    
        hora1.incrementa();
    
        hora2.decrementa();
    
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
    
                hora1,
    
                composaOperadorComparacio(hora1, hora2),
    
                hora2);
    }
}
