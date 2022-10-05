/* Aquest programa demana un mes i any i escriu l'anterior i el seguent*/

public class MesosAnys{
public static void main(String[] args) {
System.out.println("Mes?");
int mes = Integer.parseInt(Entrada.readLine());
System.out.println("Any?");
int any = Integer.parseInt(Entrada.readLine());
System.out.println("Mes anterior "+(mes-1)+"/"+any+" i mes següent "+(mes+1)+"/"+any);
}
}

