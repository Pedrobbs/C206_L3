import com.frutas.model.*;
import com.frutas.service.FrutaService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FrutaService frutaService = new FrutaService();
        Scanner scanner = new Scanner(System.in);
        List<Fruta> carrinho = new ArrayList<>();

        // Solicitar nome e CPF do comprador
        System.out.print("Digite seu nome: ");
        String nomeComprador = scanner.nextLine();
        String cpfComprador = "";
        while (true) {
            System.out.print("Digite seu CPF (somente números, 11 dígitos): ");
            cpfComprador = scanner.nextLine();
            if (cpfComprador.matches("\\d{11}")) {
                break;
            } else {
                System.out.println("CPF inválido. Por favor, tente novamente.");
            }
        }

        // Exibição das opções de frutas
        exibirOpcoesFrutas();

        boolean continuarComprando = true;
        while (continuarComprando) {
            System.out.print("\nEscolha uma fruta pelo número correspondente (ou digite '0' para sair): ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                continuarComprando = false;
                break;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarFrutaAoCarrinho(new Maca("Maçã", 3.5, "Vermelha"), carrinho, quantidade);
                    break;
                case 2:
                    adicionarFrutaAoCarrinho(new Banana("Banana", 2.0, "Nanica"), carrinho, quantidade);
                    break;
                case 3:
                    adicionarFrutaAoCarrinho(new Laranja("Laranja", 3.0, "Bahia"), carrinho, quantidade);
                    break;
                case 4:
                    adicionarFrutaAoCarrinho(new Uva("Uva", 5.0, "Rubi"), carrinho, quantidade);
                    break;
                case 5:
                    adicionarFrutaAoCarrinho(new Manga("Manga", 4.0, "Tommy"), carrinho, quantidade);
                    break;
                case 6:
                    adicionarFrutaAoCarrinho(new Abacaxi("Abacaxi", 6.0, "Pérola"), carrinho, quantidade);
                    break;
                case 7:
                    adicionarFrutaAoCarrinho(new Melancia("Melancia", 10.0, "Sem semente"), carrinho, quantidade);
                    break;
                case 8:
                    adicionarFrutaAoCarrinho(new Pera("Pera", 3.0, "Portuguesa"), carrinho, quantidade);
                    break;
                case 9:
                    adicionarFrutaAoCarrinho(new Morango("Morango", 8.0, "Fresón"), carrinho, quantidade);
                    break;
                case 10:
                    adicionarFrutaAoCarrinho(new Kiwi("Kiwi", 7.0, "Verde"), carrinho, quantidade);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }

            // Pergunta se deseja continuar comprando
            if (continuarComprando) {
                System.out.print("Deseja adicionar mais frutas ao carrinho? (S/N): ");
                scanner.nextLine(); // Limpar o buffer do teclado
                String resposta = scanner.nextLine().trim().toUpperCase();

                if (!resposta.equals("S")) {
                    continuarComprando = false;
                }
            }
        }

        // Exibir o carrinho finalizado
        if (!carrinho.isEmpty()) {
            System.out.println("\nCarrinho de Compras:");
            double total = exibirCarrinho(carrinho);
            System.out.println("Total a pagar: R$ " + total);
            System.out.println("Total de frutas selecionadas: " + carrinho.stream().mapToInt(Fruta::getQuantidade).sum());
        } else {
            System.out.println("\nNenhum item foi adicionado ao carrinho.");
        }

        // Solicitar informações de entrega ou retirada
        String tipoEntrega = "";
        String enderecoEntrega = "";
        if (!carrinho.isEmpty()) {
            System.out.print("Deseja retirar os produtos ou solicitar entrega? (Retirar/Entrega): ");
            tipoEntrega = scanner.nextLine().trim().toUpperCase();

            if (tipoEntrega.equals("ENTREGA")) {
                System.out.print("Digite seu endereço completo para entrega: ");
                enderecoEntrega = scanner.nextLine().trim();
            }
        }

        // Opção para salvar o carrinho em arquivo
        try {
            if (!carrinho.isEmpty()) {
                System.out.print("\nDeseja salvar o carrinho em um arquivo? (S/N): ");
                String salvar = scanner.nextLine().trim().toUpperCase();

                if (salvar.equals("S")) {
                    System.out.print("Digite o nome do arquivo para salvar: ");
                    String nomeArquivo = scanner.nextLine().trim();
                    frutaService.salvarFrutas(nomeArquivo, carrinho, nomeComprador, cpfComprador, tipoEntrega, enderecoEntrega);
                    System.out.println("Carrinho salvo com sucesso em '" + nomeArquivo + "'");
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o carrinho: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void exibirOpcoesFrutas() {
        System.out.println("Escolha uma fruta para adicionar ao carrinho:");
        System.out.println("1. Maçã - R$ 3.5");
        System.out.println("2. Banana - R$ 2.0");
        System.out.println("3. Laranja - R$ 3.0");
        System.out.println("4. Uva - R$ 5.0");
        System.out.println("5. Manga - R$ 4.0");
        System.out.println("6. Abacaxi - R$ 6.0");
        System.out.println("7. Melancia - R$ 10.0");
        System.out.println("8. Pera - R$ 3.0");
        System.out.println("9. Morango - R$ 8.0");
        System.out.println("10. Kiwi - R$ 7.0");
        System.out.println("0. Sair");
    }

    private static void adicionarFrutaAoCarrinho(Fruta fruta, List<Fruta> carrinho, int quantidade) {
        boolean frutaExistente = false;
        for (Fruta f : carrinho) {
            if (f.getNome().equals(fruta.getNome())) {
                f.setQuantidade(f.getQuantidade() + quantidade);
                frutaExistente = true;
                break;
            }
        }
        if (!frutaExistente) {
            fruta.setQuantidade(quantidade);
            carrinho.add(fruta);
        }
        System.out.println(fruta.getNome() + " adicionada ao carrinho. Quantidade: " + quantidade);
    }

    private static double exibirCarrinho(List<Fruta> carrinho) {
        double total = 0.0;
        for (Fruta fruta : carrinho) {
            System.out.println("- " + fruta.getNome() + " - R$ " + fruta.getPreco() + " - Quantidade: " + fruta.getQuantidade());
            total += fruta.getPreco() * fruta.getQuantidade();
        }
        return total;
    }
}