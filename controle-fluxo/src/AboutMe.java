import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    try {
    // criando o objeto scanner
    Scanner in = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = in.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = in.next();

    System.out.println("Digite sua idade");
    int idade = in.nextInt();

    System.out.println("Digite sua altura");
    double altura = in.nextDouble();

    // imprimindo os dados obtidos pelo usuario
    System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");
    in.close();
    } 
    catch (InputMismatchException e) {
        System.out.println("Os campos idade e altura precisam ser numericos");
    }
  }
}