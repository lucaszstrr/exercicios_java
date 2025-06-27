package loop;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Digite a quantidade de números Fibonacci: ");

        int num = scanner.nextInt();

        scanner.close();
        
        for (int i = 1; i <= num; i++){
            System.out.print(primeiro + " ");

            int prox = primeiro + segundo;

            primeiro = segundo;
            segundo = prox;

        }
    }   
}
