public class Punt {

    private int x = 0;
    private int y = 0;

    public int getX() {

        return x;

    }

    public void suma(Punt p){ x+=p.x; y+=p.y; }

    public void setX(int x) {

        this.x = x;

    }

    public void setY(int y){
        this.y=y;
    }

    public int getY(){ return y; }

    public Punt(int x, int y) {

        this.x = x;

        this.y = y;

    }

    public Punt(){
        this.x=0;
        this.y=0;
    }
    public String toString(){
        return ("Punt("+x+", "+y+")");
    }
}
