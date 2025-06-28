import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valorUm = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int valorDois = scanner.nextInt();

        scanner.close();

        System.out.println("O resultado da soma é: " + soma(valorUm, valorDois));
        System.out.println("O resultado da subtração é: " + sub(valorUm, valorDois));
        System.out.println("O resultado da multiplicação é: " + mult(valorUm, valorDois));
        System.out.println("O resultado da divisão é: " + div(valorUm, valorDois));
    }

    private static int soma(int valorUm, int valorDois){
        return valorUm + valorDois;
    }

    private static int sub(int valorUm, int valorDois){
        return valorUm - valorDois;
    }

    private static int mult(int valorUm, int valorDois){
        return valorUm * valorDois;
    }

    private static int div(int valorUm, int valorDois){
        return valorUm / valorDois;
    }
}