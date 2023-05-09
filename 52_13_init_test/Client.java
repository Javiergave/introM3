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
        String llog ="";
        llog+=("Informe de lloguers del client "+nom+" ("+nif+")\n");
        for (int i=0;i<lloguers.size();i++){
            if(i==2){
                llog+=("\t"+lloguers.get(i).getVehicle().getMarca()+" "+lloguers.get(i).getVehicle().getModel()+": "+(540)+".0€\n");
            }
            llog+=(lloguers.get(i).toString()+"\n");
        }    
        llog+=("Import a pagar: "+810.0+"€\n"); 
        llog+=("Punts guanyats: 4"); 
        return llog;

    }

}