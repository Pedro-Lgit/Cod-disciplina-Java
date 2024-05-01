package ProjetoA.Venda;

import ProjetoA.Carros.Veiculo;
import ProjetoA.Comprador;

public class Venda {
//membros
    private Comprador comprador;
    private Veiculo veiculo;

    public Venda(Comprador comprador, Veiculo veiculo) {
        this.comprador = comprador;
        this.veiculo = veiculo;
    }

// Método para realizar a venda
    public void realizarVenda() {
        comprador.realizarCompra(veiculo);
    }
}
