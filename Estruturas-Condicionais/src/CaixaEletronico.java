public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);

            

        } else if (saldo == valorSolicitado){
        System.out.println("Seu Saldo foi zerado"); 
        
        } else {
            System.out.println("O valor solicitado ultrapassa o limite disponível. "); 
        }
    }
}
