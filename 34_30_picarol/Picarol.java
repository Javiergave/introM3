public class Picarol{
    public Picarol Picarol;
    private int cops=0;

    public Picarol(){
        cops= 0;
    }
    public void sona(){
        System.out.println("clink-clink"); 
        cops++;
    }

    public int quantsCops(){
        return cops;
    }  
}