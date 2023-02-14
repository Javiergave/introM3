//Aquest programa és una representació d'un ascensor
public class Ascensor{ 
    private int pis = -1;
    private String moviment = "aturat";

    public String getMoviment(){
        return moviment;
    }
    public int getPis(){
        return pis;   
    }
    public void setPis(int nouPis){
        if(nouPis>=-1){
            pis=nouPis;
        }
    }
    public void setMoviment(String nouMoviment) {
        if(nouMoviment.equals("pujant")||nouMoviment.equals("baixant")||nouMoviment.equals("aturat")){
            moviment=nouMoviment;
        }
    }
}
