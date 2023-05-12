/*
 * Copyright 2023 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquesta clase és un client que té una un nif, un nom, un teléfon i diferents lloguers

import java.util.ArrayList;
public class Client {
    private static final double EUROS_PER_UNITAT_DE_COST = 30;

    private String nif;

    private String nom;

    private String telefon;

    private ArrayList<Lloguer> lloguers;


    public Client(String nif, String nom, String telefon) {

        this.nif = nif;

        this.nom = nom;

        this.telefon = telefon;

        this.lloguers = new ArrayList<Lloguer>();

    }


    public String getNif()     { return nif; }

    public String getNom()     { return nom; }

    public String getTelefon() { return telefon; }

    public ArrayList<Lloguer> getLloguers() { return lloguers; }

    public void setLloguers(Lloguer l){
        this.lloguers.add(l);
    }

    public void setNif(String nif) { this.nif = nif; }

    public void setNom(String nom) { this.nom = nom; }

    public void setTelefon(String telefon) { this.telefon = telefon; }


    public String informe() {
    
       return composaCapsalera()+composaDetall()+composaPeu();
    
    }

    private double importTotal(){
        double total=0;
        for (Lloguer lloguer: lloguers) {
            total+=lloguer.quantitat() * EUROS_PER_UNITAT_DE_COST;
        }
        return total;

    }  
    private int bonificacionsTotal(){
        int total=0;
        for (Lloguer lloguer: lloguers) {
            total+=lloguer.bonificacions();
        }
        return total;

    }   
    private String composaCapsalera(){
        return "Informe de lloguers del client " +
    
        getNom() +

        " (" + getNif() + ")\n";
    }
    private String composaDetall(){
        String resultat=""; 
        for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
    
            resultat += "\t" +
    
                lloguer.getVehicle().getMarca() +
    
                " " +
    
                lloguer.getVehicle().getModel() + ": " +
    
                (lloguer.quantitat()* EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
        }
        return resultat;
    }
    private String composaPeu(){
        return "Import a pagar: " + importTotal() + "€\n" +
    
        "Punts guanyats: " + bonificacions() + "\n";
    
    }

}