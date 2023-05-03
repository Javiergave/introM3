/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa utilitza punt.java


public class UsaSegment {

    public static void main(String[] args){

        int x1 = ((UtilString.esEnter(args[0])? Integer.parseInt(args[0]) : 0 ));// args[0] si hi és i és enter, o 0 altrament

        int y1 = ((UtilString.esEnter(args[1])? Integer.parseInt(args[0]) : 0 ));// args[1] si hi és i és enter, o 0 altrament

        int x2 = ((UtilString.esEnter(args[2])? Integer.parseInt(args[0]) : 0 ));// args[2] si hi és i és enter, o 0 altrament

        int y2 = ((UtilString.esEnter(args[3])? Integer.parseInt(args[0]) : 0 ));// args[3] si hi és i és enter, o 0 altrament

        Punt punt1 = new Punt(x1, y1);

        Punt punt2 = new Punt(x2, y2);

        Segment segment1 = new Segment(punt1, punt2);

        Segment segment2 = new Segment();

        segment2.setP1(segment1.getP2());

        segment2.setP2(segment1.getP1());

        System.out.printf("p1: %s%n", punt1);

        System.out.printf("p2: %s%n", punt2);

        System.out.printf("s1: %s s1.longitud: %.02f%n", segment1, segment1.longitud());

        System.out.printf("s2: %s s2.longitud: %.02f%n", segment2, segment2.longitud());

    }

}