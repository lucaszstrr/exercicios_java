package arrays;
import java.util.Scanner;

public class InversorArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");

        int tamanhoArray = scanner.nextInt();

        int VALORES[] = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++){
            int num = scanner.nextInt();

            VALORES[i] = num;
        }

        scanner.close();

        int ultimoItem = tamanhoArray - 1;

        for (int i = 0; i < ultimoItem; i++){

            int troca = VALORES[i];

            VALORES[i] = VALORES[ultimoItem];

            VALORES[ultimoItem] = troca;

            ultimoItem--;

        }

        System.out.println("Array invertido: ");

        for (int i = 0; i < tamanhoArray; i++){
            System.out.print(VALORES[i]);
        }

    }
}
