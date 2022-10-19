public class NotaMitja {
    public static void main(String[] args) {
        
        int notaTotal= 0;
        int notesIntroduides = 0;
        
        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());

        if ((nota>=0)&&(nota<100)){

            while ((nota>=0)&&(nota<100)){
                
                if (nota<=100){
                    notaTotal = nota + notaTotal;
                    notesIntroduides = notesIntroduides + 1;
                }

                System.out.println("Introdueix un valor");
                nota = Integer.parseInt(Entrada.readLine());
            
            
            }
        
        int mitja = notaTotal / notesIntroduides;
        
        System.out.println("La mitja de les notes vàlides és "+mitja);
        
        }
        else{
            System.out.println("Cap nota vàlida introduïda");
        }
     }
}
