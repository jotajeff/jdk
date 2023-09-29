import java.util.Scanner;

public class ExemploBoasVindas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Qual é o seu nome? ");
    String nome = input.nextLine();
    System.out.println("Bem-vindo(a), " + nome + "!");
  }
}

