/*Aquest programa demana un text i, respecte el primer caràcter,
 composa un petit informe  */

 import java.util.Scanner;

 public class InformeCaracter { 
    public static void main(String[] args) {  

        
        System.out.println("Caràcter?"); 

        Scanner sc = new Scanner(System.in);   
        char letra = sc.next().charAt(0);
        sc.close();

        if (Character.isWhitespace(letra)){
            System.out.println("Caràcter buit"); 
        }

        else{
            System.out.println("Character.getName('"+letra +"'): "+Character.getName(letra));
            System.out.println("Character.isDigit('"+letra +"'): "+Character.isDigit(letra)); 
            System.out.println("Character.isJavaIdentifierStart('"+letra +"'): "+Character.isJavaIdentifierStart(letra));
            System.out.println("Character.isJavaIdentifierPart('"+letra +"'): "+Character.isJavaIdentifierPart(letra)); 
            System.out.println("Character.isLetter('"+letra +"'): "+Character.isLetter(letra));
            System.out.println("Character.isLowerCase('"+letra +"'): "+Character.isLowerCase(letra));
            System.out.println("Character.isUpperCase('"+letra +"'): "+Character.isUpperCase(letra));
            System.out.println("Character.isWhitespace('"+letra +"'): "+Character.isWhitespace(letra));
            System.out.println("Character.toLowerCase('"+letra+"'): "+Character.toLowerCase(letra)); 
            System.out.println("Character.toUpperCase('"+letra+"'): "+Character.toUpperCase(letra)); 
        }

    }
}