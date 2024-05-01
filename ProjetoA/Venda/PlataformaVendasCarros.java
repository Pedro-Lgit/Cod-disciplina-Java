package ProjetoA.Venda;
import ProjetoA.Carros.Veiculo;
import ProjetoA.Comprador;

import java.util.ArrayList;
import java.util.List;


public class PlataformaVendasCarros {
    private List<Veiculo> carrosDisponiveis;
    private List<Comprador> compradores;

    public PlataformaVendasCarros() {
        carrosDisponiveis = new ArrayList<>();
        compradores = new ArrayList<>();
    }

    public void adicionarCarro(Veiculo veiculo) {
        carrosDisponiveis.add(veiculo);
    }

    public void adicionarComprador(Comprador comprador) {
        compradores.add(comprador);
    }

    public void exibirCarrosDisponiveis() {
        System.out.println("Carros Disponíveis:");

        for (int i = 0; i < carrosDisponiveis.size(); i++) {
            System.out.print((i + 1) + ". ");
            carrosDisponiveis.get(i).exibirInformacoes();
        }
    }

    public void realizarCompra(Comprador comprador, int indiceCarroEscolhido) {
        if (indiceCarroEscolhido >= 0 && indiceCarroEscolhido < carrosDisponiveis.size()) {
            Veiculo veiculoEscolhido = carrosDisponiveis.get(indiceCarroEscolhido);
            Venda venda = new Venda(comprador, veiculoEscolhido);
            venda.realizarVenda();
        } else {
            System.out.println("Opção inválida.");
        }
    }

}
