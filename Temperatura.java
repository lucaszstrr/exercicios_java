import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo de conversão:");
        System.out.println("[1]-Celsius p/ Fahrenheit");
        System.out.println("[2]-Fahrenheit p/ Celsius");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite a temperatura em Cº:");

                int celsius = scanner.nextInt();

                double fahrenheit = (celsius * 1.8) + 32;

                String numeroFormatado = String.format("%.2f", fahrenheit);

                System.out.println("A temperatura em Fahrenheit é de " + numeroFormatado);


                break;
        
            case 2:
                System.out.println("Digite a temperatura em Fº:");

                int fah = scanner.nextInt();

                double cel = (fah - 32) / 1.8;

                String celsiusFormatado = String.format("%.2f", cel);

                System.out.println("Temperatura em Celsius é de: " + celsiusFormatado);

                break;
            default:
                break;
        }

        scanner.close();
    }
}
