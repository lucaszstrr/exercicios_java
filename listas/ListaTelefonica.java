package listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ListaTelefonica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, String> lista = new HashMap<>();

        boolean validador = true;

        while (validador){
            System.out.println("\n-------------MENU------------- \nDigite o que você quer fazer: \n [1] - Adicionar um Contato  \n [2] - Remover um Contato \n [3] - Listar Contatos  \n [4] - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1 :
                    System.out.println("Digite o nome: ");

                    String nome = scanner.next();

                    System.out.println("Digite o número: ");

                    String numero = scanner.next();

                    lista.put(nome, numero);

                    System.out.println("Contato " + nome + " adicionado com sucesso!");

                    espera();
                    
                    break;
                case 2:
                    if (lista.isEmpty()){
                        System.out.println("Você ainda não tem nenhum contato");

                        espera();

                        break;
                    }

                    System.out.println("Qual contato você deseja remover ? (digite o nome)");

                    ArrayList<String> nomes = new ArrayList<>(lista.keySet());

                    for (int i = 0; i < lista.size(); i++){
                        System.out.println("[" + i + "] - " + nomes.get(i));
                    }

                    String contatoADeletar = scanner.next();

                    if(lista.remove(contatoADeletar) == null){
                        System.out.println("Contato inexistente");

                        espera();

                        break;
                    }

                    System.out.println("Contato " + contatoADeletar + " removido com sucesso!");

                    lista.remove(contatoADeletar);

                    espera();
                    
                    break;
                case 3:
                    if (lista.isEmpty()){
                        System.out.println("Você ainda não tem nenhum contato");

                        espera();

                        break;
                    }

                    System.out.println("Esta é a sua lista de contatos: ");

                    ArrayList<String> nomesLista = new ArrayList<>(lista.keySet());

                    for (int i = 0; i < lista.size(); i++){
                        System.out.println("[" + i + "] - " + nomesLista.get(i));
                    }

                    espera();

                    break;
                case 4:
                    System.out.println("Você escolheu sair!");

                    espera();

                    return;
                default:
                    System.out.println("Opção inválida!");           
                    
                    espera();

                    break;
            }

        }

        scanner.close();
    }

    public static void espera(){
        try{
            Thread.sleep(700);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
