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

        double total = 0;
    
        int bonificacions = 0;
    
        String resultat = "Informe de lloguers del client " +
    
            getNom() +
    
            " (" + getNif() + ")\n";
    
        for (Lloguer lloguer: lloguers) {

    
    
            // afegeix lloguers freqüents
    
            bonificacions ++;
    
    
            // afegeix bonificació per dos dies de lloguer de Luxe
    
            if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
    
                    lloguer.getDies()>1 ) {
    
                bonificacions ++;
    
            }
    
    
            // composa els resultats d'aquest lloguer
    
            resultat += "\t" +
    
                lloguer.getVehicle().getMarca() +
    
                " " +
    
                lloguer.getVehicle().getModel() + ": " +
    
                (lloguer.quantitat()* 30) + "€" + "\n";
    
            total += lloguer.quantitat() * 30;
    
        }
    
    
        // afegeix informació final
    
        resultat += "Import a pagar: " + total + "€\n" +
    
            "Punts guanyats: " + bonificacions + "\n";
    
        return resultat;
    
    }

    
}