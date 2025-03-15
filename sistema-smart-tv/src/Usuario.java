public class Usuario {

    //  MÉTODO "MAIN": É O MÉTODO PRINCIPAL O QUAL EXECUTA AS APLICAÇÕES. 

    public static void main(String[] args) throws Exception {

        //Criação de classe  (orientação a objeto)
        SmartTv smartTv = new SmartTv(); 

        System.out.println("---------------- STATUS TV ----------------");

        System.out.println("");

        // STATUS DA TV
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume); 

        System.out.println("");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("\nCanal atual : " + smartTv.canal);

        System.out.println("");

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        


    }
}
