public class NotaMitja {
    public static void main(String[] args) {
        
        int notaTotal= 0;
        int notesIntroduides = 1;
        
        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());

        if ((nota>=0)&&(nota<100)){

            while ((nota>=0)&&(nota<100)){
                
                if (nota>100){
                    notesIntroduides = 0;
                }
                else {
                    notaTotal=nota;
                }
            
                System.out.println("Introdueix un valor");
                nota = Integer.parseInt(Entrada.readLine());
            
                if ((nota<100)&&(nota>=0)){
                    notesIntroduides = notesIntroduides + 1;
            
                    notaTotal = nota + notaTotal;
                }
            
            }
        
        int mitja = notaTotal / notesIntroduides;
        
        System.out.println("La mitja de les notes vàlides és "+mitja);
        
        }
        System.out.println("Cap nota vàlida introduïda");
       
     }
}
