//Aquest programa és una representació d'un ascensor
public class Ascensor{ 
    public int pis = -1;
    public String moviment = "aturat";
    public int getPis() {  
        return pis;
    }
    public String getMoviment() {  
        return moviment;
    }
    public void setPis(int nouPis) {  
        if(nouPis>-1){
            pis = nouPis;
        }
    }
    public void setMoviment(String nouMoviment) {  
        if(nouMoviment.equals("pujant")||nouMoviment.equals("baixant")||nouMoviment.equals("aturat")){
            moviment = nouMoviment; 
        }
    }
}
