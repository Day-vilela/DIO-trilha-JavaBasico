public class SistemaMedida {

    /**
     * Estrutura Condicional SWITCH CASE 
     * @param args
     */
    public static void main(String[] args) {
        String sigla = "M";

        /* ESTRUTURA EM IF-ELSE COMUMENTE USADA
        if (sigla == "P") {
            System.out.println("PEQUENO");
            
        } else if (sigla == "M"){
            System.out.println("MÉDIO");

        }else if (sigla == "G"){
            System.out.println("GRANDE");
            
        }else {
            System.out.println("INDEFINIDO");
        }
     */

        // AGORA EM SWITH CASE
        
        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G" : {
                System.out.println("GRANDE");
                break;
            }
        
            default:
                System.out.println("INDEFINIDO");
        }

    }
}
