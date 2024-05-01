package ProjetoA;

import ProjetoA.Carros.Carro;
import ProjetoA.Carros.Veiculo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        PlataformaVendasCarros plataforma = new PlataformaVendasCarros();

        // Adicionar carros à plataforma
        Veiculo carro1 = new Carro("Civic", "Honda", 2022, 95000.00);
        Veiculo carro2 = new Carro("Corolla", "Toyota", 2023, 105000.00);
        plataforma.adicionarCarro(carro1);
        plataforma.adicionarCarro(carro2);

        // Adicionar compradores à plataforma
        Comprador comprador1 = new Comprador("João", "12345678900", 120000.00);
        Comprador comprador2 = new Comprador("Maria", "98765432100", 90000.00);
        plataforma.adicionarComprador(comprador1);
        plataforma.adicionarComprador(comprador2);

        System.out.println("=============================================");
        System.out.println("Bem-vindo a plataforma de vendas de carros: ");
        System.out.println("=============================================");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Deseja comprar algum carro? (s/n)");
        String escolhaDaCompra = scanner1.nextLine();

        if (escolhaDaCompra.equalsIgnoreCase("s")){  //equalsIgnoreCase utiizando para comprar a String coloca pelo usuario
            // Exibir carros disponíveis na plataforma
            plataforma.exibirCarrosDisponiveis();

            // Simular interação do usuário para realizar compra
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número do carro que deseja comprar: ");
            int escolhaCarro = scanner.nextInt() - 1; // Subtrai 1 para obter o índice correto na lista
            scanner.nextLine(); // Limpar o buffer

            // Realizar compra conforme a escolha do usuário
            plataforma.realizarCompra(comprador1, escolhaCarro);  //passando comprador1 para comprar o carro
        }
        else{
            System.out.println("|Entre novamente em nossa plataforma quando estiver preparado para \n uma nova emoção, um NOVO carro, até lá....");
        }
    }
}
