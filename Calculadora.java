import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valorUm = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int valorDois = scanner.nextInt();


        int soma = valorUm + valorDois;
        int sub = valorUm - valorDois;
        int mult = valorUm * valorDois;
        int div = valorUm / valorDois;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + sub);
        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println("O resultado da divisão é: " + div);


        scanner.close();
    }
}