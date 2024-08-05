import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite seu idade");
            int idade = scanner.nextInt();

            System.out.println("Digite seu altura");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pleo usuario
            System.out.println();
            System.out.println("---------- MENSAGEM ----------");
            System.out.println();
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " "+ sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            System.out.println(); // pular linha    

        scanner.close();
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("---------- MENSAGEM ----------");
            System.out.println();
            System.err.println("O campo idade e altura precisam \nser numericos.");
            System.err.print("Use  o sinal de ponto '.' para \nseparar casas decimais.");
            System.out.println();// pular linha
        }
    }
}
