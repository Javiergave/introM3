// Aquest programa simula un ascensor
public class Ascensor {
    public static void main(String[] args) {
        System.out.println("pis?");
        String pis = Entrada.readLine();
        System.out.println("botó?");
        String boto = Entrada.readLine();
        if (((pis.equals("planta baixa"))||(pis.equals("primer pis"))||(pis.equals("segon pis")))&&((boto.equals("pujar un"))||(boto.equals("pujar dos"))||(boto.equals("baixar un"))||(boto.equals("baixar dos")))){
            if ((pis.equals("planta baixa"))&&((boto.equals("baixar un"))||((boto.equals("baixar dos"))))){
            System.out.println("error");
            }
            if ((pis.equals("segon pis"))&&((boto.equals("pujar un"))||((boto.equals("pujar dos"))))){
            System.out.println("error");
            }
            if ((pis.equals("primer pis"))&&((boto.equals("baixar dos"))||((boto.equals("pujar dos"))))){
            System.out.println("error");
            }
            if (pis.equals("planta baixa")&&(boto.equals("pujar un"))){
                System.out.println("primer pis");
            }   
            if (pis.equals("planta baixa")&&(boto.equals("pujar dos"))){
                System.out.println("segon pis");
            }
            if (pis.equals("primer pis")&&(boto.equals("pujar un"))){
                System.out.println("segon pis");
            }
            if (pis.equals("primer pis")&&(boto.equals("baixar un"))){
                System.out.println("planta baixa");
            }
            if (pis.equals("segon pis")&&(boto.equals("baixar dos"))){
                System.out.println("planta baixa");
            }
            
            if (pis.equals("segon pis")&&boto.equals("baixar un")){
                System.out.println("primer pis");
            }
     
        } 
        
   else {
    System.out.println("error");
    }
}
}
