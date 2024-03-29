/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta classe complementa Zoo i Categoria
public class Animal {
    private int id;
    private String nom;
    private Categoria cat;

    public int getId(){ 
        if(this.idIndefinit()==false){
            return id; 
        }
        return -1;
    }
    public void setId(int id){  this.id=id; } 
    public String getNom(){ return nom; } 
    public Categoria getCategoria(){ return cat; }
    public void setCategoria(Categoria c){  this.cat=c; } 
    public boolean idIndefinit(){
        return (id<1);
    }
    public Animal(String nom, Categoria categoria) throws IllegalArgumentException{
        if(nom==null||nom.isBlank()){
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        if(categoria==null){
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.nom=nom;
        this.cat=categoria;
    }
    public Animal(int id, String nom, Categoria categoria) throws IllegalArgumentException{
        if(nom==null||nom.isBlank()){
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        if(categoria==null){
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        if (id < 0) {

            throw new IllegalArgumentException("L'identificador ha de ser positiu");

        }
        this.id=id;
        this.nom=nom;
        cat=categoria;
    }

    @Override

    public String toString() {

        return "Animal(id:" +

            (id <= 0 ? "indefinit" : id) +

            ", " + nom +", "+ this.getCategoria().toString()+")";

    }
}
