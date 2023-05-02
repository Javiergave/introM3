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

    public void setX42() {

        Punt p = new Punt();

        p.setX(42);

        assertEquals(42, p.getX());

    }


    @Test

    public void constructorEspecific() {

        Punt p = new Punt(1, 2);

        assertAll(

            () -> assertEquals(1, p.getX()),

            () -> assertEquals(2, p.getY())

        );

    }

    @Test 
    public void constructorDefecteYZero(){
        Punt p = new Punt();

        assertEquals(0, p.getY());
    }
}