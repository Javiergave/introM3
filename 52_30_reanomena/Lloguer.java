
/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta clase és un lloguer d'un vehicle que té un client
public class Lloguer {
    private static final double COST_DIA_BASE = 1.5;
    private static final double COST_DIA_GENERAL = 2.5;
    private static final double COST_DIA_LUXE = 6;
    private static final double DIES_BASE = 3;
    private static final double DIES_GENERAL = 2;
    private static final double DIES_LUXE = 1;
    private static final double QUANT_BASE = 3;
    private static final double QUANT_GENERAL = 4;


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
    public double quantitatPerLloguer(){
        double quantitat_per_dia = 0;
        switch (this.getVehicle().getCategoria()) {
    
            case 1:
    
            quantitat_per_dia += QUANT_BASE;
    
                if (this.getDies() > DIES_BASE) {
  
                    quantitat_per_dia += (this.getDies() - DIES_BASE) * COST_DIA_BASE;
   
                }
    
                break;
    
            case 2:
    
            quantitat_per_dia += QUANT_GENERAL;
    
                if (this.getDies() > DIES_GENERAL) {
    
                    quantitat_per_dia += (this.getDies() - DIES_GENERAL) * COST_DIA_GENERAL;
    
                }
    
                break;
    
            case 3:
    
            quantitat_per_dia += this.getDies() * COST_DIA_LUXE;
    
                break;
    
        }
        return quantitat_per_dia;
    }

    public int bonificacionsDeLloguer(){
        if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
    
                    this.getDies()>DIES_LUXE ) {
    
                return 2;
    
        }else{
            return 1;
        }
    }
}
