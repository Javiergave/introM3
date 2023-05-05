/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta clase és un punt que té una coordenada x i y
public class Punt {

    private int[] coord=new int[2];

    public int getX() {

        return coord[0];

    }

    public void suma(Punt p){ this.coord[0]+=p.coord[0]; this.coord[1]+=p.coord[1]; }

    public void setX(int x) {

        this.coord[0] = x;

    }

    public void setY(int y){
        this.coord[1]=y;
    }

    public int getY(){ return coord[1]; }

    public Punt(int x, int y) throws IllegalArgumentException{
        if(x>-1 && y>-1){
            this.coord[0] = x;

            this.coord[1] = y;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public Punt(){
        this.coord[0]=0;
        this.coord[1]=0;
    }
    public String toString(){
        return ("Punt("+coord[0]+", "+coord[1]+")");
    }
}
