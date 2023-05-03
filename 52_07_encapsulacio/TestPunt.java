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
public class TestPunt {

    @Test
    public void constructor() {

        // comprova que Punt() pugui ser cridat

        new Punt();

    }
    @Test
    public void constructorEspecific() {

        Punt p = new Punt(1, 2);

        assertEquals(1, p.getX());

        assertEquals(2, p.getY());

    }

    @Test
    public void suma() {

        Punt p1 = new Punt(0,1);
        Punt p2 = new Punt(2,5);
        p1.suma(p2);
        assertEquals(p1.getX(),2);
        assertEquals(p1.getY(),6);

    }

    @Test
    public void constructorDefecteXZero() {

        // comprova que Punt() deixi a 0 la propietat x de Punt

        Punt p = new Punt();

        assertEquals(0, p.getX());

    }

    @Test
    public void setY69420() {
        Punt p = new Punt();

        p.setY(69420);
        assertEquals(69420, p.getY());
    }
    @Test
    public void setX69420() {
        Punt p = new Punt();

        p.setX(69420);
        assertEquals(69420, p.getX());
    }

    @Test 
    public void constructorDefecteYZero(){
        Punt p = new Punt();

        assertEquals(0, p.getY());
    }
}