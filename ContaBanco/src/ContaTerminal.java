import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("----------BEM-VINDO(A) AO BANCO DIO----------\n");

        // CLASSE SCANNER
        Scanner scanner = new Scanner(System.in);

        //MENSSAGEM AO USUÁRIO
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Entre com o Saldo inicial: ");
        double saldo = scanner.nextDouble();

        // MENSSAGEM A RESPEITO DAS INFORMAÇÕES OBTIDAS
        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. \nSua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está pronto para saque.");

        System.out.println("\n---------- FIM CONTA ----------");


        scanner.close();
    }
}
