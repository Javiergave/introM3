public class NotaMitja {
    public static void main(String[] args) {
        
        int notesIntroduides = 1
        
        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());
        
        if (nota<0){
        System.out.println("Cap nota vàlida introduïda");
        }
        
        while (nota >= 0){
        
            if (nota<100){
            notesIntroduides = notesIntroduides + 1
            
            int notaTotal = nota + notaTotal
            }
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        }
        
       int mitja = notaTotal / notesIntroduides
        
        System.out.println("La mitja de les notes vàlides és "+mitja);
        
     }
}
