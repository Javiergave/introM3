//Aquest programa agafa una àncora entrada per l'usuari i indica quin dels valors introduïts després és mes proper fins a que s'introdueixi un nombre negatiu
public class TrobaMesProxim {
    public static void main(String[] args) {

        int distanciaAnt = -1;
        int valorProxim = -1;
        
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        if (ancora >= 0) {
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
            if (valor>=0){
                if (valor >= ancora){
                    distanciaAnt = valor-ancora;    
                } else {
                    distanciaAnt = ancora-valor;
                }
            } else { 
                System.out.println("No s'ha introduït cap valor positiu");
                }
            
            
            while (valor >= 0){
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            
                if (valor >= ancora){
                int distancia = valor-ancora;
                
                    if (distancia<distanciaAnt) {
                        if (valorProxim>valor){
                            valorProxim = valor;
                        }
                    }
                } else {
                    int distancia = ancora-valor;
                    if (distancia <= distanciaAnt) {
                        if (valorProxim>valor){
                            valorProxim = valor;
                        }
                    }
                }
         
       } 
       System.out.println("El nombre més pròxim a "+ancora+" és "+valorProxim);
       }else {   
            System.out.println("Àncora no vàlida");
       }
    }
}
