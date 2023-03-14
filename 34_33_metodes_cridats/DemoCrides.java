/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest excercici fa les crides en l'ordre demanat a l'excercici
class DemoCrides {
    public static void main(String[] args) {
        Feli feli1 = new Feli();
        Gat gat1 = new Gat();
        GatRenat gatrenat1 = new GatRenat();
        feli1.netejaUrpes();
        gat1.netejaUrpes();
        gatrenat1.netejaUrpes();
        gat1.miola();
        gatrenat1.miola();
        Menjar bacalla = new Menjar("bacallà");
        gatrenat1.menja(bacalla);
        gat1.menja(bacalla);
        gat1.netejaUrpes();
    }
    
}
