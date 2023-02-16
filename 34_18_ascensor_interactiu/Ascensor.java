//Aquest programa és una representació d'un ascensor
public class Ascensor{ 
    private int pis = -1;
    private String moviment = "aturat";

    public boolean aturat(){
        if(moviment.equals("aturat")){
            return true;
        }
        setMoviment("aturat");
        return true;
    }
    
    public boolean arrencaAmunt(){
        if(moviment.equals("aturat")){
            setMoviment("pujant");
            return true;
        }
        return false;
    }
    public boolean arrencaAbaix(){
        if(moviment.equals("aturat")){
            setMoviment("baixant");
            return true;
        }
        return false;
    }
    public int seguentPis(){
        if(moviment.equals("pujant")){
            if(pis==10){
                setPis(9);
                setMoviment("baixant");
            }
            setPis(pis+1);
        }
        if(moviment.equals("baixant")){
            if(pis==-1){
                setPis(-1);
                setMoviment("pujant");
            }
            setPis(pis-1);
        }
        return pis;
    }
    public boolean estaAbaix (){
        if (pis==-1){
            return true;
        }
        return false;
    }
    public boolean estaAmunt (){
        if (pis==10){
            return true;
        }
        return false;
    }

    public boolean estaAturat (){
        if (moviment.equals("aturat")){
            return true;
        }
        return false;
    }
    public boolean estaMovent (){
        if(!moviment.equals("aturat")){
            return true;
        }
        return false;
    }

    public boolean estaPujant (){
        if (moviment.equals("pujant")){
            return true;
        }
        return false;
    }
    public boolean estaBaixant (){
        if (moviment.equals("baixant")){
            return true;
        }
        return false;
    }

    public String comEsta(){
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
