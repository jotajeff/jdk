import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número (maior que o primeiro):");
        int num2 = scanner.nextInt();

        if (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        } else {
            Random random = new Random();
            int num_aleatorio = random.nextInt(num2 - num1 + 1) + num1;
            System.out.println("O número aleatório gerado entre " + num1 + " e " + num2 + " é: " + num_aleatorio);
        }

        scanner.close();
    }
}

