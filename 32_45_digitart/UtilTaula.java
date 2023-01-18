/*Utilitats per a Taules fetes de arrays de arrays */
public class UtilTaula {
    public static char[][] substitueix(char[][] origen, char x,char  ch){
        char[][] substitueix = new char[6][7];
        substitueix = origen;
        for (int i = 0; i<=5; i++){
            for (int j = 0; j<=6; j++){

                if (origen[i][j]==x){
                    substitueix[i][j] = ch;
                }
            }
        }
        return substitueix;
    }
}
