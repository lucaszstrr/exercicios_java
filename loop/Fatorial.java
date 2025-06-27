package loop;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");

        int numero = scanner.nextInt();

        int resultado = 1;

        for (int i = numero; i > 0; i--){
            
            resultado *= i;
            
        }

        System.out.println(numero + "! = " + resultado);

        scanner.close();
    }    
}
