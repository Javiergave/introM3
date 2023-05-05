/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta clase és un punt que té una coordenada x i y
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
