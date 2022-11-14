
/*vagi demanant texts fins que un no contingui el darrer 
caràcter del text anterior. El primer text és acceptat 
sempre a menys que estigui buit.*/

public class ConteDarrer {
    public static void main(String[] args) {  

        System.out.println("Introdueix texts (enter sol per finalitzar)"); 
        String frase = Entrada.readLine();

        if (frase.isEmpty){

            goto 46;

        }
        else {
            
            char ultimaLletra = Character.toLowerCase(frase.charAt(frase.length()-1));
        }

        while (frase.isEmpty()==false){

            System.out.println("bé");
            frase = Entrada.readLine();

            if (frase.isEmpty()==false){

                if (frase.indexOf(ultimaLletra)>-1){

                    ultimaLletra = Character.toLowerCase(frase.charAt(frase.length()-1));

                }
                else{

                    break;

                }

            }
            else{

                break;

            }

        }

        System.out.println("Adéu"); 

    }  
}
