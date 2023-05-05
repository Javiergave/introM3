/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa utilitza punt.java

public class UsaPunt {

    public static void main(String[] args){
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        
        if(args.length>0){
            x1 = ((UtilString.esEnter(args[0])? Integer.parseInt(args[0]) : 0 ));// args[0] si hi és i és enter, o 0 altrament
        }
        if(args.length>1){
            y1 = ((UtilString.esEnter(args[1])? Integer.parseInt(args[1]) : 0 ));//  args[1] si hi és i és enter, o 0 altrament
        }
        if(args.length>2){
            x2 = ((UtilString.esEnter(args[2])? Integer.parseInt(args[2]) : 0 ));// args[0] si hi és i és enter, o 0 altrament
        }
        if(args.length>3){
            y2 = ((UtilString.esEnter(args[3])? Integer.parseInt(args[3]) : 0 ));//  args[1] si hi és i és enter, o 0 altrament
        }
        try{
            Punt p1 = new Punt(x1, y1);

            Punt p2 = new Punt(x2, y2);

            System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());

            System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());

            p1.suma(p2);

            System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
        }
        catch (IllegalArgumentException e){
            System.out.println("No és un nombre adequat"); 
        }
    }

}
