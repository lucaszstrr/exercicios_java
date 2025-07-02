package listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Compras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> compras = new ArrayList<>();

        boolean validador = true;
        
        while (validador) {
            System.out.println("\n-------------MENU------------- \nDigite o que você quer fazer: \n [1] - Adicionar um item  \n [2] - Remover um Item \n [3] - Listar Itens  \n [4] - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o que você deseja adicionar: ");
                    String item = scanner.next();

                    compras.add(item);

                    System.out.println("Sua lista: " + compras);

                    break;
                case 2:
                    System.out.println("Qual item você deseja remover: ");
                    
                    String deletarItem = scanner.next();

                    boolean deletar = compras.contains(deletarItem);

                    if (deletar == false) {
                        System.out.println("Item inválido!");

                        break;
                    } 

                    System.out.println("Item " + deletarItem + " deletado com sucesso!");

                    compras.remove(deletarItem);

                    break;

                case 3:
                    
                    System.out.println("Esta é a sua lista atual: " + compras);

                    break;
                case 4:
                    System.out.println("Até breve!");

                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}