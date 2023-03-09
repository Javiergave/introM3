/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
/*tenim un cotxe amb un Chasis i unes rodes, cada cosa es trenca en un moment distint, 
pero si es trenca una cosa el cotxe deixa de funcionar */
public class Cotxe{
    public boolean funciona=true;
    private int desgast=0;
    public void trencar(){
        this.funciona=false;
    }
    public int xequeig(){
        return this.desgast;
    }
    public void utilitzar(){
        if(funciona){
            System.out.println("El cotxe es mou"); 
            desgast++;
            if(desgast==100){
                this.trencar();
                System.out.println("El cotxe s'ha trencat"); 
            }
        }
        else{
            System.out.println("El cotxe està trencat");
        }
    }

}
//la roda es trenca amb 70 de desgast
class Roda extends Cotxe{
    public boolean funciona=true;
    private int desgastRoda=0;
    @Override
    public void utilitzar(){
        if(super.funciona){
            if(funciona){
                super.utilitzar();
                desgastRoda++;
            }
            else{
                System.out.println("La roda està trencada"); 
            }
            
            if(desgastRoda==70){
                funciona=false;
                super.trencar();
                System.out.println("La roda s'ha trencat"); 
            }
        }
        else{
            System.out.println("El cotxe està trencat");
        }
    }
}
//el chasis es trenca amb 90 de desgast
class Chasis extends Cotxe{
    public boolean funciona=true;
    private int desgastChasis=0;
    @Override
    public void utilitzar(){
        if(super.funciona){
            if(funciona){
                super.utilitzar();
                desgastChasis++;
            }
            else{
                System.out.println("El chasis està trencat"); 
            }
            
            if(desgastChasis==90){
                funciona=false;
                super.trencar();
                System.out.println("El chasis s'ha trencat"); 
            }
        }
        else{
            System.out.println("El cotxe està trencat");
        }
    }
}
