/*Utilitats per a Taules fetes de arrays de arrays */
public class UtilTaula {
    public static char[][] substitueix(char[][] origen, char x,char  ch){
        char[][] substitueix = new char[5][];
        substitueix = origen;
        for (int i = 0; i<=origen.length-1; i++){
            for (int j = 0; j<=origen.length-1; j++){

                if (origen[i][j]==x){
                    substitueix[i][j] = ch;
                }
            }
        }
        return substitueix;
    }
}
