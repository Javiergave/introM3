/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest excercici fa les crides en l'ordre demanat a l'excercici
public class DemoCrides {
    Feli feli = new GatRenat();
    Gat gat = new GatRenat();
    GatRenat gatrenat = new GatRenat();
    feli.netejaUrpes();
    gat.netejaUrpes();
    gatrenat.netejaUrpes();
    gat.miola();
    gatrenat.miola();
    Menjar bacalla = new Menjar("bacallà");
    gatrenat.menja();
    gat.menja();
    gat.netejaUrpes();
}
