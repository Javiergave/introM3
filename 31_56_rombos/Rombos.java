//Aquest programa et demana un nombre i fa la quantitat de rombos desitjada
public class Rombos {
    public static void main(String[] args) {     
        
        System.out.println("quants?");
        int valor = Integer.parseInt(Entrada.readLine()); 

        for (int i = valor; i>=1; i--){
            
            for (int j = 9; j>=0; j--){
                
                for (int k = j ; k>=1; k--){
                    System.out.print("."); 
                }

                for (int l = j; l <= 8; l++) {
                    System.out.print(l);
                }

                System.out.print("9"); 

                for (int m = 8; m>=j ; m--) {
                    System.out.print(m);
                }
            
                for (int n = j ; n>=1; n--){
                    System.out.print("."); 
                }

                System.out.println(); 

            }

            
            
                for (int j = 1; j<=9; j++){
                
                    for (int k = 1 ; k<=j; k++){
                        System.out.print("."); 
                    }

                    for (int l = j; l <= 8; l++) {
                        System.out.print(l);
                    }

                    System.out.print("9"); 

                    for (int m = 8; m>=j ; m--) {
                        System.out.print(m);
                    }
            
                    for (int n = j ; n>=1; n--){
                        System.out.print("."); 
                    }

                System.out.println(); 

                }

            
            
            System.out.println(); 

        }

    }
}