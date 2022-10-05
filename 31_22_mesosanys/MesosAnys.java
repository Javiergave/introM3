/* Aquest programa demana un mes i any i escriu l'anterior i el seguent*/

public class MesosAnys{
public static void main(String[] args) {
System.out.println("Mes?");
int mes = Integer.parseInt(Entrada.readLine());
System.out.println("Any?");
int any = Integer.parseInt(Entrada.readLine());
switch (mes){
case 2,3,4,5,6,7,8,9,10,11:
System.out.println("Mes anterior "+(mes-1)+"/"+any+" i mes següent "+(mes+1)+"/"+any);
break;
case 1:
System.out.println("Mes anterior "+(mes+11)+"/"+(any-1)+" i mes següent "+(mes+1)+"/"+any);
break;
case 12:
System.out.println("Mes anterior "+(mes-1)+"/"+any+" i mes següent "+(mes-11)+"/"+(any+1));
break;
}
}
}

