package arrays;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");

        int tamanhoArray = scanner.nextInt();

        int VALORES[] = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++){
            int valor = scanner.nextInt();

            VALORES[i] = valor;
        }

        int maiorValor = VALORES[0];

        for (int i = 1; i < tamanhoArray; i++){
            if (VALORES[i] > maiorValor){
                maiorValor = VALORES[i];
            }
        }

        int menorValor = VALORES[0];

        for (int i = 1; i < tamanhoArray; i++){
            if (VALORES[i] < menorValor){
                menorValor = VALORES[i];
            }
        }

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);

        scanner.close();
    }
}
