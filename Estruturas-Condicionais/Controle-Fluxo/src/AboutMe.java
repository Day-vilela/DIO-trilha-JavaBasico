import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //Imprimindo os dados fornecidos
        System.out.println(" ");

        System.out.println("olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho "+ idade + " anos ");
        System.out.println("Minha altura é de " + altura +
         "cm ");
        
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos.");
        }
    }
}
