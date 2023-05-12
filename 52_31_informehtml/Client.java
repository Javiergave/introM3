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


    public String informeHTML() {
    
       return composaCapsaleraHTML()+composaDetallHTML()+composaPeuHTML();
    
    }

    private double importTotal(){
        double total=0;
        for (Lloguer lloguer: lloguers) {
            total+=lloguer.quantitat() * EUROS_PER_UNITAT_DE_COST;
        }
        return total;

    }  
    private int bonificacions(){
        int total=0;
        for (Lloguer lloguer: lloguers) {
            total+=lloguer.bonificacionsDeLloguer();
        }
        return total;

    }   
    private String composaCapsaleraHTML(){
        return "<p>Informe de lloguers del client <em>" +
    
        getNom() +

        "</em> (<strong>" + getNif() + "</strong>)\n</p><table>";
    }
    private String composaDetallHTML(){
        String resultat=""; 
        for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
    
            resultat += "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>\t<tr><td>" +
    
                lloguer.getVehicle().getMarca() +
    
                "</td><td> " +
    
                lloguer.getVehicle().getModel() + "</td><td>: " +
    
                (lloguer.quantitat()* EUROS_PER_UNITAT_DE_COST) + "€</td><td>" + "\n";
        }
        return resultat;
    }
    private String composaPeuHTML(){
        return "</table><p>Import a pagar: <em>" + importTotal() + "€</em></p>\n" +
    
        "<p>Punts guanyats: <em>" + bonificacions() + "</em></p>\n";
    
    }

}