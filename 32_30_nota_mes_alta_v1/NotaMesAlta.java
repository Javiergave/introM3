/*Aquest programa demana les notes obtingudes pels estudiants de programació 
en el darrer examen (com a mínim dues) i indica quina ha estat la 
nota més alta. El programa deixarà de recollir notes quan rebi un valor negatiu.*/
public class NotaMesAlta {
    public static void main(String[] args) {  

        int nota= 0;
        int notaMesAlta = 0;
        int i = 0;

        System.out.println("Introdueix les notes (-1 per finalitzar)"); 
        
        for (i = 0; nota!=-1; i++){
            nota = Integer.parseInt(Entrada.readLine()); 
            if (nota == -1){
                break;
            }
            else if (nota>notaMesAlta){
                notaMesAlta = nota;
            }




        }

        if (i <2){
            System.out.println("Com a mínim calen dues notes"); 
        }

        else{

            System.out.println("La nota més alta és "+notaMesAlta);

        }

    }   
}
