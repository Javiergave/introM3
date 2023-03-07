public class Picarol{
    public Picarol Picarol;
    private int cops=1;

    public Picarol(){
        cops= 1;
    }
    public void sona(){
        for(int i = 0; i<=cops;i++){
            System.out.println("clink-clink"); 
            cops++;
        }
        
    }

    public int quantsCops(){
        return cops;
    }  
}