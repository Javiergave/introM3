
/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa és una prova unitària de Client.informe
import org.junit.jupiter.api.Test;
import java.beans.Transient;

import static org.junit.jupiter.api.Assertions.*;
public class TestGestor {
    @Test
    public void informe(){
        Client c = GestorLite.creaClientDemo();
        assertEquals(c.informe(),"Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tSeat 600: 90.0€\n\tTata Vista: 180.0€\n\tFiat Uno: 540.0€\nImport a pagar: 810.0€\nPunts guanyats: 4");
    }

    public void informeBuit(){
        Client c;
        assertEquals(c.informe(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n");
    }

    public void informeBasic1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 1);
        Lloguer l= new Lloguer(v, 1);
        c.setLloguers(l);
        assertEquals(c.informe(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n");
    }
}
