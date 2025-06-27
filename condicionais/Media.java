package condicionais;
import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a primeira nota: ");

        double notaUm = scanner.nextDouble();
       
        System.out.println("Digite a segunda nota: ");

        double notaDois = scanner.nextDouble();
       
        System.out.println("Digite a terceira nota: ");

        double notaTres = scanner.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;

        System.out.println("A média é igual a: " + media);

        String validacao = verificarAprovacao(media);

        System.out.println(validacao);

        scanner.close();
    }

    public static String verificarAprovacao(double media){
        if (media >= 6){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
