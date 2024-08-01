import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 0.0;

        // Entradas
        System.out.println("Digite o número da Conta");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o número da Agência");
        agencia = scanner.next();
        scanner.nextLine(); 

        System.out.println("Digite seu nome");
        nomeCliente = scanner.nextLine();

        // Verifica um valor valido para o saldo
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Digite o valor do Saldo");
            try {
                saldo = scanner.nextDouble();
                validInput = true; // Entrada válida
            } catch (InputMismatchException e) {
                System.out.println("Erro: valor inválido para o saldo. Por favor, insira um número.");
                scanner.next(); // Limpa o buffer de entrada
            }
        }


        // Saída
        System.out.println("-------------------------------");
        System.out.println("Conta criada com sucesso!");
        System.out.println("-------------------------------");
        System.out.println("Conta:   " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("-------------------------------");
        System.out.println("Saldo:   " + saldo);
        System.out.println("-------------------------------");
        System.out.println();

        scanner.close(); // Fim do método Scanner
    }
}
