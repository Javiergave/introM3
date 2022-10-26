/*
 * Aquest programa agafa un nombre de l'1 al 7 i diu el dia de la setmana que li correspon
 *
 * Demana un nombres per entrada estàndard i mostra el
 * dia de la setmana corresponent a aquest número
 *
 * En cas que el nombre introduit no sigui de l'1 al 7 es mostrarà un missatge de "Error"
 */
public class DiaSetmanaSwitch {
  public static void main(String[] args) {
   int dia = Integer.parseInt(args[0]);
   switch (dia){
     case 1:
     System.out.println("Dilluns");
     break;
     case 2:
     System.out.println("Dimarts");
     break;
     case 3:
     System.out.println("Dimecres");
     break;
     case 4:
     System.out.println("Dijous");
     break;
     case 5:
     System.out.println("Divendres");
     break;
     case 6:
     System.out.println("Dissabte");
     break;
     case 7:
     System.out.println("Diumenge");
     break;
     default :
     System.out.println("Error");
     break;
     }
     

}}
                           
