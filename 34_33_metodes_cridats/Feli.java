/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
public class Feli {

    public Feli() {

        System.out.println("Neix Felí");

    }

    public void netejaUrpes() {

        System.out.println("Felí neteja urpes des de " + this.getClass());

    }

    public void menja(Menjar menjar) {

        System.out.println("Felí menja " + menjar + " des de " + this.getClass());

    }

}


