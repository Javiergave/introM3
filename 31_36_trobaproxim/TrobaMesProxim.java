//Aquest programa agafa una àncora entrada per l'usuari i indica quin dels valors introduïts després és mes proper fins a que s'introdueixi un nombre negatiu
public class TrobaMesProxim {
    public static void main(String[] args) {
        
        int distanciaAnt = 2147483647;
        int distancia = 2147483647;

        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        
        if (ancora >= 0) {

            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
            int valorProxim = valor;
            
            if ((valor>=0)&&(valor!=ancora)){
            
                while (valor >= 0){
                    
                    distanciaAnt = Math.abs(valor-ancora);

                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());

                    distancia = Math.abs(valor-ancora);
                    
                    if ((valor>0)&&((distancia<=distanciaAnt)&&(valor<valorProxim))){
                        valorProxim = valor;
                    }

                    if ((valor>0)&&(distancia<distanciaAnt)){
                        valorProxim = valor;
                    }
                }
                
                System.out.println("El valor introduït més pròxim a "+ancora+" és "+valorProxim);
            }
            else if (valor<0){
                System.out.println("No s'ha introduït cap valor positiu");
            }
            else if (valor == ancora){
                while (valor>=0){
                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());   
                }
                System.out.println("El valor introduït més pròxim a "+ancora+" és "+ancora);
            }
        }
        else {   
            System.out.println("Àncora no vàlida");
        }
         
       }
       
       
}
