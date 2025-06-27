package loop;
import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        String resultado = primo(numero);

        System.out.println(resultado);

        scanner.close();
    }

    public static String primo(int numero){
        int primo = 0;

        for (int i = numero; i > 0; i--){
            if (numero % i == 0){
                primo++;
            }
        }

        if (primo == 2){
            return numero + " é um número primo";
        } else {
            return numero + " não é um número primo";
        }
    }
}
