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

         Punt punt = new Punt();

         int x = (UtilString.esEnter(args[0])?Integer.parseInt(args[0]):0);// args[0] si hi és i és enter, o 0 altrament

         int y = (UtilString.esEnter(args[1])?Integer.parseInt(args[1]):0);//  args[1] si hi és i és enter, o 0 altrament

         punt.setX(x);

         punt.setY(y);

         System.out.printf("punt.getX() -> %d%n", punt.getX());

         System.out.printf("punt.getY() -> %d%n", punt.getY());

     }

 }
