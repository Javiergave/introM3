/*Aquest programa demana un text i, respecte el primer caràcter,
 composa un petit informe  */

import javax.swing.text.AttributeSet.CharacterAttribute;

 public class InformeCaracter { 
    public static void main(String[] args) {  

        
        System.out.println("Caràcter?"); 
        String paraula = Entrada.readLine(); 

        if (paraula.isBlank()){
            System.out.println("Caràcter buit"); 
        }

        else{
            char letra = paraula.charAt(0);
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