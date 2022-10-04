/*
 * Aquest programa agafa un nombre de l'1 al 7 i diu el dia de la setmana que li correspon
 *
 * Demana un nombres per entrada estàndard i mostra el
 * dia de la setmana corresponent a aquest número
 *
 * En cas que el nombre introduit no sigui de l'1 al 7 es mostrarà un missatge de "Error"
 */
public class DiaSetmanaSwitchExpr2 {
  public static void main(String[] args) {
   int nota = Integer.parseInt(args[0]);
   switch (nota){
     case 1,2,3,4:
     System.out.println("D");
     break;
     case 5,6:
     System.out.println("C");
     break;
     case 7,8:
     System.out.println("B");
     break;
     case 9,10:
     System.out.println("A");
     break;
     default :
     System.out.println("X");
     break;
     }
     

}}
                           
