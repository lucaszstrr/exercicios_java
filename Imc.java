import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Cálculo do IMC");
        System.out.println("Digite sua altura em metros (digite com '.'): ");

        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso em kgs: ");

        double peso = scanner.nextDouble();

        System.out.println("Seu IMC é de " + imc(altura, peso));

        scanner.close();
    }

    private static String imc(double altura, double peso){
        double imc = peso / Math.pow(altura, 2);

        String imcFormatado = String.format("%.2f", imc);
    
        return imcFormatado;
    }
}
