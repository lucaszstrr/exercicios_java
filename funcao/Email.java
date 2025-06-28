package funcao;
import java.util.Scanner;

public class Email {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto e direi se é um email ou não: ");

        String email = scanner.next();

        int validadorArroba = validadorArroba(email);
        int validadorPonto = validadorPonto(email);

        if (validadorArroba != 1 && validadorPonto != 1){
            System.out.println("Email " + email + " inválido!");
        } else {
            System.out.println("Email " + email + "  válido!");
        }

        scanner.close();
    }    

    private static int validadorArroba(String email){
        int validadorArroba = 0;

        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                validadorArroba++;
            }
        }

        return validadorArroba;
    }

    private static int validadorPonto(String email){
        int validadorPonto = 0;

        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '.'){
                validadorPonto++;
            }
        }

        return validadorPonto;
    }
}
