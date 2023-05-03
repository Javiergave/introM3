public class Punt {

    private int[] coord=new int[2];

    public int getX() {

        return coord[0];

    }

    public void suma(Punt p){ coord[0]+=coord[0]; coord[1]+=coord[1]; }

    public void setX(int x) {

        this.coord[0] = x;

    }

    public void setY(int y){
        this.coord[1]=y;
    }

    public int getY(){ return coord[1]; }

    public Punt(int x, int y) {

        this.coord[0] = x;

        this.coord[1] = y;

    }

    public Punt(){
        this.coord[0]=0;
        this.coord[1]=0;
    }
    public String toString(){
        return ("Punt("+coord[0]+", "+coord[1]+")");
    }
}
