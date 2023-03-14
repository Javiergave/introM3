/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */

//Aquest es el Gat Renat, te més funcions que un gat normal
public class GatRenat extends Gat{ 
    
    public GatRenat(int novesVides,String novaPosicio) {

        setVides(novesVides);
        setPosicio(novaPosicio);

    }
    public GatRenat(int novesVides) {

        setVides(novesVides);

    }
    public GatRenat(String novaPosicio) {

        setPosicio(novaPosicio);

    }

    public GatRenat() {

    }

}
