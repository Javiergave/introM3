//Aquest programa agafa una àncora entrada per l'usuari i indica quin dels valors introduïts després és mes proper fins a que s'introdueixi un nombre negatiu
public class TrobaMesProxim {
    public static void main(String[] args) {

        int distanciaAnt = 345676543;
        int distancia;
        
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        
        if (ancora >= 0) {
        
            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
            int valorProxim = valor;
                if (valor>=0){
            
                    if (valor > ancora){
                        distanciaAnt = valor-ancora; 
                    }
                 
                    else {
                        distanciaAnt = ancora-valor;
                    }
                
                } 
            
                else { 
                System.out.println("No s'ha introduït cap valor positiu");
                }
            
            
            while (valor >= 0){
            
                System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
                
                if (valor >= ancora){
                    distancia = valor-ancora; 
                }
                 
                else {
                   distancia = ancora-valor;
                }
                
                if (distancia<distanciaAnt){
                    valorProxim = valor;
                }
                
                if ((distancia<=distanciaAnt)&&(valor<valorProxim)){
                    valorProxim = valor;
                }
                if (ancora==valor){
                    valorProxim = valor;
                }

            }

            System.out.println("El valor introduït més pròxim a "+ancora+" és "+valorProxim);
       }
       
       else {   
            System.out.println("Àncora no vàlida");
       }
    }
}
