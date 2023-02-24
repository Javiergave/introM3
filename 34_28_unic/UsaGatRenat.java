public class UsaGatRenat {

    public static void main(String[] args) {

        GatRenat renat = GatRenat.getInstancia();

        System.out.println("Inicialment Renat està " + renat.getPosicio());

        for (String posicio: args) {

            canviaPosicio(posicio);

            System.out.println("Ara està " + renat.getInstancia());

        }

    }

    private static void canviaPosicio(String novaPosicio) {

        if(novaPosicio.equals("1")||novaPosicio.equals("2")||novaPosicio.equals("3")){

            int pos = Integer.parseInt(novaPosicio);

            switch (pos){
                case 1:
                    GatRenat.getInstancia("estirat");
                break;

                case 2:
                    GatRenat.getInstancia("assegut");
                break;

                case 3:
                    GatRenat.getInstancia("dret");
                break;

                default:
                break;
            }

        }else if(novaPosicio.equals("dret")||novaPosicio.equals("estirat")||novaPosicio.equals("assegut")){
            GatRenat.getInstancia(novaPosicio);
        }

    }

}