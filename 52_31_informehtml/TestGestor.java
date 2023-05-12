
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
    public void informeHTML(){
        Client c = GestorLite.creaClientDemo();
        assertEquals(c.informeHTML(),"Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tSeat 600: 90.0€\n\tTata Vista: 180.0€\n\tFiat Uno: 540.0€\nImport a pagar: 810.0€\nPunts guanyats: 4\n");
    }
    @Test
    public void informeBuit(){
        Client c = new Client("34563452","Eulàlia","34323453");
        assertEquals(c.informeHTML(),"Informe de lloguers del client Eulàlia (34563452)\nImport a pagar: 0.0€\nPunts guanyats: 0\n");
    }
    @Test
    public void informeBasic1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 1);
        Lloguer l= new Lloguer(v, 1);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 90.0€\nImport a pagar: 90.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informeBasic2Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 1);
        Lloguer l= new Lloguer(v, 2);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 90.0€\nImport a pagar: 90.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informeBasic3Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 1);
        Lloguer l= new Lloguer(v, 3);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif()+")\n\tFiat Panda: 90.0€\nImport a pagar: 90.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informeBasic5Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 1);
        Lloguer l= new Lloguer(v, 5);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 180.0€\nImport a pagar: 180.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informe2Basic1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 1);
        Vehicle v2 = new Vehicle("Fiat", "Panda", 1);
        Lloguer l= new Lloguer(v, 1);
        Lloguer l2= new Lloguer(v2, 1);
        c.setLloguers(l);
        c.setLloguers(l2);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 90.0€\n\tFiat Panda: 90.0€\nImport a pagar: 180.0€\nPunts guanyats: 2\n");
    }
    @Test
    public void informeGeneral1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 2);
        Lloguer l= new Lloguer(v, 1);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 120.0€\nImport a pagar: 120.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informeGeneral2Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 2);
        Lloguer l= new Lloguer(v, 2);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 120.0€\nImport a pagar: 120.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informeGeneral3Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 2);
        Lloguer l= new Lloguer(v, 3);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 195.0€\nImport a pagar: 195.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informeLuxe3Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 3);
        Lloguer l= new Lloguer(v, 3);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 540.0€\nImport a pagar: 540.0€\nPunts guanyats: 2\n");
    }
    @Test
    public void informeLuxe2Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 3);
        Lloguer l= new Lloguer(v, 2);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 360.0€\nImport a pagar: 360.0€\nPunts guanyats: 2\n");
    }
    @Test
    public void informeLuxe1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 3);
        Lloguer l= new Lloguer(v, 1);
        c.setLloguers(l);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 180.0€\nImport a pagar: 180.0€\nPunts guanyats: 1\n");
    }
    @Test
    public void informe2Luxe1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 3);
        Vehicle v2=new Vehicle("Fiat", "Panda", 3);
        Lloguer l= new Lloguer(v, 1);
        Lloguer l2= new Lloguer(v2, 1);
        c.setLloguers(l);
        c.setLloguers(l2);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 180.0€\n\tFiat Panda: 180.0€\nImport a pagar: 360.0€\nPunts guanyats: 2\n");
    }
    @Test
    public void informe2General1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 2);
        Vehicle v2=new Vehicle("Fiat", "Panda", 2);
        Lloguer l= new Lloguer(v, 1);
        Lloguer l2= new Lloguer(v2, 1);
        c.setLloguers(l);
        c.setLloguers(l2);
        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 120.0€\n\tFiat Panda: 120.0€\nImport a pagar: 240.0€\nPunts guanyats: 2\n");
    }
    @Test
    public void informe3General1Dia(){
        Client c = new Client("34563452","Eulàlia","34323453");
        Vehicle v=new Vehicle("Fiat", "Panda", 2);
        Vehicle v3=new Vehicle("Fiat", "Panda", 2);
        Vehicle v2=new Vehicle("Fiat", "Panda", 2);
        Lloguer l= new Lloguer(v, 1);
        Lloguer l2= new Lloguer(v2, 1);
        Lloguer l3= new Lloguer(v3, 1);
        c.setLloguers(l);
        c.setLloguers(l2);
        c.setLloguers(l3);

        assertEquals(c.informeHTML(),"Informe de lloguers del client " + c.getNom() + " (" + c.getNif() + ")\n\tFiat Panda: 120.0€\n\tFiat Panda: 120.0€\n\tFiat Panda: 120.0€\nImport a pagar: 360.0€\nPunts guanyats: 3\n");
    }
}
