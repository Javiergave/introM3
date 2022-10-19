public class NotaMitja {
    public static void main(String[] args) {
        
        int notaTotal= 0;
        
        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());
        int notesIntroduides = 1;
        if (nota>100){
        notesIntroduides = 0;
        notaTotal = 0;
        }
        
        
        if (nota<0){
        System.out.println("Cap nota vàlida introduïda");
        }
        
        
        while (nota >= 0){
            
            
            System.out.println("Introdueix un valor");
            nota = Integer.parseInt(Entrada.readLine());
            
            if ((nota<100)&&(nota>0)){
            notesIntroduides = notesIntroduides + 1;
            
            notaTotal = nota + notaTotal;
            }
            
            
        }
        
       int mitja = notaTotal / notesIntroduides;
        
        if (notaTotal>0) {
            System.out.println("La mitja de les notes vàlides és "+mitja);
        }
     }
}
