package condicionais;
import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número qualquer: ");

        int numero = scanner.nextInt();

        int divisao = numero % 2;

        if (divisao == 0) {
            System.out.println(numero + " é um número par");
        } else if (divisao != 0) {
            System.out.println(numero + " é um número ímpar");            
        }

        scanner.close();
    }
}