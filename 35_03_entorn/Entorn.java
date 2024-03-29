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
        System.out.print("botiga> "); 
    }

    public void processaAfegeix() {
        System.out.print("nom (enter cancel·la)> ");
        String nom=Entrada.readLine();
        if(nom.isEmpty()){return;}

        System.out.print("preu (en cèntims)> "); 
        String preuString=Entrada.readLine();
        if(preuString.isEmpty()){
            preuString="0";
        } 
        if(!UtilString.esEnter(preuString)){
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }

        System.out.print("estoc (enter sense estoc)> "); 
        String estocString=Entrada.readLine();

        if(estocString.isEmpty()){
            estocString="0";
        }
             
        if(UtilString.esEnter(preuString)){
            int preu=Integer.parseInt(preuString);
            if(UtilString.esEnter(estocString)){
                int estoc=Integer.parseInt(estocString);
                Vi nouVi=new Vi(nom,preu,estoc);
                if(botiga.afegeix(nouVi)==null){
                    System.out.println("ERROR: no s'ha pogut afegir");
                    return; 
                }
                System.out.println("Introduït:"); 
                System.out.print(nouVi.toString()); 
            }
            else{
                Vi nouVi=new Vi(nom,preu);
                if(nouVi!=null){
                    if(botiga.cerca(nouVi.getNom())==null){
                        System.out.println("ERROR: el valor ha de ser un enter positiu");
                        return;
                    }            
                }
                System.out.println("Introduït:"); 
                System.out.print(nouVi.toString()); 
            }
        }
        else{
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        
    }
    public void processaCerca() {
        System.out.print("nom (enter cancel·la)> "); 
        String nomString = Entrada.readLine();
        if(nomString.isEmpty()){return;}

        Vi cercat = botiga.cerca(nomString);
        if(cercat==null){
            System.out.println("No trobat"); 
        }
        else{
            System.out.print("Trobat:");
            System.out.println(cercat.toString());
        }
    }
    public void processaElimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom=Entrada.readLine();
        if(nom.isEmpty()){return;}

        Vi cercat = botiga.cerca(nom);
        if(cercat==null){
            System.out.println("No trobat"); 
        }
        else{
            System.out.print("A eliminar:");
            System.out.println(cercat.toString());

            System.out.print("Segur?> "); 
            String confirma = Entrada.readLine();

            if(UtilitatsConfirmacio.respostaABoolean(confirma)){
                if(botiga.elimina(nom)==null){
                    System.out.println("ERROR: no s'ha pogut eliminar"); 
                }
                else{
                    botiga.elimina(nom);
                    System.out.println("Eliminat"); 
                }
            }
            else{
                System.out.println("No eliminat");
                return; 
            }
        }
    }
    public void processaModifica() {
        System.out.print("nom (enter cancel·la)> ");
        String nom=Entrada.readLine();
        if(nom.isEmpty()){return;}
        if(botiga.cerca(nom)!=null){

            System.out.print("preu (enter "+botiga.cerca(nom).getPreu()+")> "); 
            String preuString=Entrada.readLine();
            if(preuString.isEmpty()){
                preuString="69420";
            }  

            if(!UtilString.esEnter(preuString)){
                System.out.println("ERROR: el valor ha de ser un enter positiu"); 
                return;
            }
            
            System.out.print("estoc (enter "+botiga.cerca(nom).getEstoc()+")> "); 
            String estocString=Entrada.readLine();

            if(estocString.isEmpty()){
                estocString="69420";
            }
 
            int preu;
            if(preuString.equals("69420")){
                preu=botiga.cerca(nom).getPreu();
            }
            else{
                preu=Integer.parseInt(preuString);
            }
            if(UtilString.esEnter(estocString)){
                int estoc;
                if(estocString.equals("69420")){
                    estoc=botiga.cerca(nom).getEstoc();
                }
                else{
                    estoc=Integer.parseInt(estocString);
                }

                Vi cercat = botiga.cerca(nom);

                cercat.setEstoc(estoc);
                cercat.setPreu(preu);
                    
            }
            else{
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return; 
            }
            System.out.print    ("Modificat:"); 
            System.out.println(botiga.cerca(nom).toString()); 
            
        }
        else{
            System.out.println("No trobat"); 
            return;
        }
    }
}
