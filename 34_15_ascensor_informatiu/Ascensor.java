//Aquest programa és una representació d'un ascensor
public class Ascensor{ 
    private int pis = -1;
    private String moviment = "aturat";

    public boolean estaAbaix (int pis){
        if (pis==-1){
            return true;
        }
        return false;
    }
    public boolean estaAmunt (int pis){
        if (pis==10){
            return true;
        }
        return false;
    }

    public boolean estaAturat (String moviment){
        if (moviment.equals("aturat")){
            return true;
        }
        return false;
    }
    public boolean estaMovent (String moviment){
        if(!moviment.equals("aturat")){
            return true;
        }
        return false;
    }

    public boolean estaPujant (String moviment){
        if (moviment.equals("pujant")){
            return true;
        }
        return false;
    }
    public boolean estaBaixant (String moviment){
        if (moviment.equals("baixant")){
            return true;
        }
        return false;
    }

    public String comEsta(String moviment,int pis){
        return (moviment+" al pis "+pis);
    }

    public String getMoviment(){
        return moviment;
    }
    public int getPis(){
        return pis;   
    }
    public void setPis(int nouPis){
        if(nouPis>=-1&&nouPis<=10){
            pis=nouPis;
        }
    }
    public void setMoviment(String nouMoviment) {
        if(nouMoviment.equals("pujant")||nouMoviment.equals("baixant")||nouMoviment.equals("aturat")){
            moviment=nouMoviment;
        }
    }
}
