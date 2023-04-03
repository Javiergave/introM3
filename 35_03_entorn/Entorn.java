/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa es l'entorn de la botiga i els vins
public class Entorn {

    private final Botiga botiga = new Botiga();

    public static void main(String[] args) {

        Entorn entorn = new Entorn();

        mostraBenvinguda();

        while (true) {

            mostraPrompt();

            String comanda = Entrada.readLine().strip();

            if (comanda.isEmpty()) continue;

            if (comanda.equals("surt")) break;

            switch (comanda) {

                case "ajuda": mostraAjuda();

                             break;

                case "afegeix": entorn.processaAfegeix();

                           break;

                case "cerca": entorn.processaCerca();

                             break;

                case "modifica": entorn.processaModifica();

                            break;

                case "elimina": entorn.processaElimina();

                           break;

                default: mostraErrorComandaDesconeguda();

            }

        }

        mostraComiat();

    }

    public static void mostraBenvinguda() {  
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions."); 
    }

    public static void mostraComiat() {
        System.out.println("adéu"); 
    } 

    public static void mostraAjuda() {
        System.out.println("Comandes disponibles:");
        System.out.println("ajuda");
        System.out.println("cerca");
        System.out.println("afegeix");
        System.out.println("modifica");
        System.out.println("elimina");
        System.out.println("surt");       
    }  

    public static void mostraErrorComandaDesconeguda() { 
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    } 

    public static void mostraPrompt() { 
        System.out.print("botiga>"); 
    }

    public static void processaAfegeix() {
        System.out.print("nom (enter cancel·la)> ");
        String nom=Entrada.readLine();
        System.out.print("preu (en cèntims)> "); 
        String preuString=Entrada.readLine();
        System.out.print("estoc (enter sense estoc)> "); 
        String estocString=Entrada.readLine();
        if(estocString.isEmpty()){
            estocString="0";
        }
        if(preuString.isEmpty()){
            estocString="0";
        }     
        if(UtilString.esEnter(preuString)){
            int preu=Integer.parseInt(preuString);
            if(UtilString.esEnter(estocString)){
                int estoc=Integer.parseInt(estocString);
                Vi nouVi=new Vi(nom,preu,estoc);
                if(nouVi!=null){
                    Vi fet = botiga.afegeix(nouVi);
                    if(fet==null){
                        System.out.println("ERROR: no s'ha pogut afegir"); 
                    }
                }
            }
            else{
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return; 
            }
            Vi nouVi=new Vi(nom,preu);
            if(nouVi!=null){
                Vi fet = botiga.afegeix(nouVi);
                if(fet==null){
                    System.out.println("ERROR: no s'ha pogut afegir"); 
                }            }
            System.out.println("Introduït:"); 
            System.out.println(nouVi.toString()); 
        }
        else{
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return; 
        }
        
       
    }
    public static void processaCerca() {
        System.out.print("nom (enter cancel·la)> "); 
        String nomString = Entrada.readLine();
        Vi cercat = botiga.cerca(nomString);
        if(cercat==null){
            System.out.println("No trobat"); 
        }
        else{
            System.out.println("Trobat: ");
            System.out.println(cercat.toString());
        }
    }
    public static void processaElimina() {
        
    }
    public static void processaModifica() {
        System.out.print("nom (enter cancel·la)> ");
        String nom=Entrada.readLine();
        System.out.print("preu (en cèntims)> "); 
        String preuString=Entrada.readLine();
        System.out.print("estoc (enter sense estoc)> "); 
        String estocString=Entrada.readLine();

        Vi aModificar = botiga.cerca(nom);

        if(estocString.isEmpty()){
            estocString="0";
        }
        if(preuString.isEmpty()){
            estocString="0";
        }     
        if(UtilString.esEnter(preuString)){
            int preu=Integer.parseInt(preuString);
            if(UtilString.esEnter(estocString)){
                int estoc=Integer.parseInt(estocString);
                Vi cercat = botiga.cerca(nom);
                if(cercat==null){
                    System.out.println("No trobat"); 
                    return;
                }
                else{
                    cercat.setEstoc(estoc);
                    cercat.setPreu(preu);
                }
            }
            else{
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return; 
            }
            System.out.println("Modificat:"); 
            System.out.println(nouVi.toString()); 
        }
        else{
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return; 
        }
        
    }
}
