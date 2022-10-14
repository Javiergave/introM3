//Aquest programa agafa una àncora entrada per l'usuari i indica quin dels valors introduïts després és mes proper fins a que s'introdueixi un nombre negatiu
public class TrobaMesProxim {
    public static void main(String[] args) {

        int distanciaAnt = 0;
        int valorProxim = 0;
        
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
            if (ancora >= 0) {
            if (valor>=0){
                if (valor >= ancora){
                    distanciaAnt = valor-ancora;    
                } else {
                    distanciaAnt = ancora-valor;
                }
            
            
            while (valor >= 0){
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            
                if (valor >= ancora){
                int distancia = valor-ancora;
                
                    if (distancia <= distanciaAnt) {
                    valorProxim = valor;
                    }
                } else {
                    int distancia = ancora-valor;
                    if (distancia <= distanciaAnt) {
                        valorProxim = valor;
                        }
                    }

            }
            } else {
            System.out.println("No s'ha introduït cap valor positiu");
            }
            System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorProxim);   
         
       } else {   
        
        System.out.println("Àncora no vàlida");
        }
    }
}
