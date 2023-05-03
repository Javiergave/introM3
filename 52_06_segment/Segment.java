/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa utilitza punt.java
public class Segment { 
    private Punt p1;
    private Punt p2;

    public Segment(Punt p1a,Punt p2a){
        p1 = p1a; 
        p2=p2a;
    }

    public Segment(){
        p1 = new Punt(0,0);
        p2 = new Punt(0,0);
    }

    public Double longitud(){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
    }
    public Punt getP1(){ return p1;}
    public Punt getP2(){return p2;}
    public void setP1(Punt p){
        p1 = p;
    }
    public void setP2(Punt p){
        p2 = p;
    }
    public String toString(){
        return ("Segment("+p1.toString()+""+p2.toString()+""+this.longitud());
    }
}
