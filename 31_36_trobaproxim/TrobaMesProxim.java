//Aquest programa agafa una àncora entrada per l'usuari i indica quin dels valors introduïts després és mes proper fins a que s'introdueixi un nombre negatiu
public class TrobaMesProxim {
    public static void main(String[] args) {

        int distanciaAnt = 345676543;
        int distancia = 99999999;
        int valorEncertat = 0;
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        
        if (ancora >= 0) {
        
            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
            int valorProxim = valor;
            
            if (valor>=0){
            
                while (valor >= 0){
                    
                    if (valor > ancora){
                        distanciaAnt = valor-ancora; 
                    }
                 
                    else if (valor<ancora) {
                        distanciaAnt = ancora-valor;
                    }
                    if (valor==ancora) {
                    valorEncertat = valor;
                    }
            
                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());
                    
                        if (valor > ancora){
                            distancia = valor-ancora; 
                        }
                 
                        else if (valor < ancora) {
                            distancia = ancora-valor;
                        }
                
                        if (distancia<distanciaAnt){
                            valorProxim = valor;
                        }
                
                        if ((distancia<=distanciaAnt)&&(valor<valorProxim)){
                            valorProxim = valor;
                        }
                    
                }
            if (valorEncertat==ancora){
                System.out.println("El valor introduït més pròxim a "+ancora+" és "+valorEncertat);
            }
            else{
                System.out.println("El valor introduït més pròxim a "+ancora+" és "+valorProxim);
            }
       } else {
            System.out.println("No s'ha introduït cap valor positiu");
       }
       }
       
       else {   
            System.out.println("Àncora no vàlida");
       }
    }
}

