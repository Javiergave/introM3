/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa testeja el programa Punt.java
import org.junit.jupiter.api.Test;
import java.beans.Transient;

import static org.junit.jupiter.api.Assertions.*;
public class TestSegment{
    @Test
    public void constructor() {

        // comprova que Segment() pugui ser cridat

        new Segment();

    }
    @Test
    public void constructorEspecific() {

        // comprova que Segment() pugui ser cridat
        Punt p1= new Punt(2,3);
        Punt p2 = new Punt(4,1);
        Segment s = new Segment(p1,p2);
        assertAll(
            ()-> assertEquals(2,p1.getX()),
            ()-> assertEquals(3,p1.getY()),
            ()-> assertEquals(4,p2.getX()),
            ()-> assertEquals(1,p2.getY())
        );
    }
    @Test
    public void longitud() {
        Punt p1= new Punt(2,3);
        Punt p2 = new Punt(4,1);
        Segment s = new Segment(p1,p2);
        double len = s.longitud();
        assertEquals(2,Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2)));
    }
}
