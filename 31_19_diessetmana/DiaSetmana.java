/*
 * Aquest programa agafa un nombre de l'1 al 7 i diu el dia de la setmana que li correspon
 *
 * Demana un nombres per entrada estàndard i mostra el
 * dia de la setmana corresponent a aquest número
 *
 * En cas que el nombre introduit no sigui de l'1 al 7 es mostrarà un missatge de "Error"
 */
public class DiaSetmana {
  public static void main(String[] args) {
   int dia = Integer.parseInt(args[0]);
   if (dia>=1 && dia<=7){
     if (dia==1){
     System.out.println("Dilluns");
     }
        else if (dia==2){
         System.out.println("Dimarts");
         }
            else if (dia==3){
            System.out.println("Dimecres");
            }
                else if (dia==4){
                     System.out.println("Dijous");
                     }
                        else if (dia==5){
                            System.out.println("Divendres");
                            }
                                else if (dia==6){
                                    System.out.println("Dissabte");
                                    }
                                        else if (dia==7){
                                            System.out.println("Diumenge");
                                            }
   }
   else { System.out.println("Error");}

}}
                           
