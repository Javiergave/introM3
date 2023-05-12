
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
        return ("\t"+cotxe.getMarca()+" "+cotxe.getModel()+": "+(cotxe.getCategoria()*90)+".0€");
    }
    public double quantitat(){
        double quantitat = 0;
    
        switch (this.getVehicle().getCategoria()) {
    
            case 1:
    
                quantitat += 3;
    
                if (this.getDies() > 3) {
  
                    quantitat += (this.getDies() - 3) * 1.5;
   
                }
    
                break;
    
            case 2:
    
                quantitat += 4;
    
                if (this.getDies() > 2) {
    
                    quantitat += (this.getDies() - 2) * 2.5;
    
                }
    
                break;
    
            case 3:
    
                quantitat += this.getDies() * 6;
    
                break;
    
        }
        return quantitat;
    }

    public int bonificacionsDeLloguer(){
        if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
    
                    this.getDies()>1 ) {
    
                return 2;
    
        }else{
            return 1;
        }
    }
}
