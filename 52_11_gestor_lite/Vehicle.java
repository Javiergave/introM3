
/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest objecte és un vehicle que pot ser llogat i té un model una marca i una categoria
public class Vehicle {
    public static final int BASIC=1;
    public static final int GENERAL=2;
    public static final int LUXE=3;

    private String model;
    private String marca;
    private int categoria;

    public Vehicle(String marc,String mod,int cat){
        model=mod;
        marca=marc;
        categoria=cat;
    }
    public void setModel(String c){  this.model=c; } 
    public String getModel(){ return model; } 
    public void setMarca(String c){  this.marca=c; } 
    public String getMarca(){ return marca; }
    public void setCategoria(int c){  this.categoria=c; } 
    public int getCategoria(){ return categoria; } 
}
