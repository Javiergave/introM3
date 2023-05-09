
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
        assertEquals(c.informe(),"Nif del client: "+c.getNif()+"\n"+"Nom del client: "+c.getNom()+"\n"+"Teléfon del client: "+c.getTelefon()+"\n"+"Llogers actius: "+c.getLloguers());
    }
}
