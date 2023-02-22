//Un rellotge que es pot incrementar i incrementar la hora
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

    public static boolean esValida(int hores,int minuts, int segons){
        if(hores<24&&hores>-1){
            if(minuts<60&&minuts>-1){
                if(segons<60&&segons>-1){
                    return true;
                }
            }
        }
        return false;
    }

    public Hora duplica(){
        return new Hora(this.getHores(),this.getMinuts(),this.getSegons());
    }
    public static Hora duplica(Hora hora){
        return new Hora(hora.getHores(),hora.getMinuts(),hora.getSegons());
    }

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
    public void incrementa(int incrementa){

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
    public static int compareTo(Hora hora1,Hora hora2){
        int totalHoraEste = hora1.hores*3600 + hora1.minuts*60 + hora1.segons;
        int totalHoraOtro = hora2.hores*3600 + hora2.minuts*60 + hora2.segons;
        if(totalHoraEste<totalHoraOtro){
            return -1;
        }
        else if(totalHoraEste>totalHoraOtro){
            return 1;
        }
        return 0;
    }
    public int compareTo(Hora hora1){
        int totalHoraEste = hora1.hores*3600 + hora1.minuts*60 + hora1.segons;
        int totalHoraOtro = this.hores*3600 + this.minuts*60 + this.segons;

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

        int comparacio = compareTo(hora1,hora2);
    
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
