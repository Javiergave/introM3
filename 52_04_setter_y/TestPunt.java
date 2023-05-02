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
    public void constructorDefecteYZero(){
        Punt p = new Punt();

        assertEquals(0, p.getY());
    }
}