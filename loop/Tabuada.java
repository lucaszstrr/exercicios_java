package loop;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();
        
        for (int i = 1; i < 11; i++){
            System.out.println(numero + " * " + i + " = " + numero * i);
        }

        scanner.close();
    }
}
