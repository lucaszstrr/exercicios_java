package condicionais;
import java.util.Scanner;

public class Manipulacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome qualquer: ");

        String nome = scanner.next();

        scanner.close();

        int maiuscula = maiusculas(nome);
        int minuscula = minusculas(nome);

        System.out.println("Quantidade de maiúsculas é de: " + maiuscula);
        System.out.println("Quantidade de minúsculas é de: " + minuscula);
    }

    public static int maiusculas(String nome){
        int maiuscula = 0;
        
        for (int i=0; i < nome.length(); i++) {
            if (Character.isUpperCase(nome.charAt(i))) {
                maiuscula++;
            }
        }

        return maiuscula;
    }

    public static int minusculas(String nome){
        int minusculas = 0;

        for (int i=0; i < nome.length(); i++){
            if(Character.isLowerCase(nome.charAt(i))){
                minusculas++;
            }
        }

        return minusculas;
    }
}
