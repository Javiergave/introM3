import javax.swing.SwingConstants;

import org.w3c.dom.stylesheets.StyleSheet;

//Un rellotge que es pot incrementar i decrementar la hora
/**

 * Compara dues hores i retorna l'operador corresponent

 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els

 * altres dos valors possibles són ">" i "=="

 * @param hora1: primera hora a comparar

 * @param hora2: segona hora a comparar

 * @return operador resultant

 */
public class Hora {
    private int hores=0;
    private int minuts=0;
    private int segons=0;
    public Hora(){

    }
    public Hora(int hora,int minut,int segon){
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
    public void incrementa(){
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
    public void incrementa(int increment){

        if (increment<0){
            return;
        } 

        if(getSegons()+increment<59){
            setSegons(getSegons()+increment);
        }
        else if(getSegons()+increment>59){
            for(int i = (getSegons()+increment)/60;i>0;i--,increment=-60){
                if(getMinuts()+1>59){
                    setHores(getHores()+1);
                }
                else{
                    setMinuts(getMinuts()+1);
                }
            }
            setMinuts(getMinuts()+increment);
            
        }

    }
    public void decrementa(){
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
    public void decrementa(int decrementa){
        if (decrementa<0){
            return;
        }

        if(getSegons()-decrementa<0){
            if(getMinuts()-(1+decrementa/60)<0){
                if(getHores()-(1+decrementa/3600)<0){
                    setHores(23-(decrementa/3600));
                }
                else{
                    setHores(getHores()-(1+decrementa/3600));
                }
            }
            else{
                setMinuts(getMinuts()-((decrementa/60)));
            }
            setMinuts(getMinuts()-((decrementa/60)));
            setSegons(59-((decrementa/60)));
        }else{
            setSegons(getSegons()-decrementa);
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
    public void setHores(int novaHora){
        if(novaHora<=23&&novaHora>=0){
            hores=novaHora;
        }
    }
    public void setMinuts(int novaMinuts){
        minuts=novaMinuts;
    }
    public void setSegons(int novaSegons){
        segons=novaSegons;
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
    
    
    public static void main(String[] args) {
    
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
