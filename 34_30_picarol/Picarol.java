public class Picarol{
    public Picarol Picarol;
    private int cops=0;

    public Picarol(){
        
    }
    public void sona(){
        cops= 2;
        for(int i = 0; i<cops;i++){
            System.out.println("clink-clink"); 
            
        }
        cops++;
        
    }

    public int quantsCops(){
        return cops;
    }  
}