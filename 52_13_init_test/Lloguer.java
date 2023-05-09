
/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta clase és un lloguer d'un vehicle que té un client
public class Lloguer {
    private int dies;
    private Vehicle cotxe;
    public Lloguer(int dia,Vehicle v){
        dies=dia;
        cotxe=v;
    }
    public Lloguer(Vehicle v,int dia){
        dies=dia;
        cotxe=v;
    }

    public Vehicle getVehicle(){ return cotxe; } 
    public void setCosa(Vehicle c){  this.cotxe=c; } 
    public int getDies(){ return dies;  }
    public void setDies(int q){  dies = q;  }
    @Override
    public String toString(){
        return ("   "+cotxe.getMarca()+" "+cotxe.getModel()+": "+(cotxe.getCategoria()*45*dies)+".0€");
    }
}
