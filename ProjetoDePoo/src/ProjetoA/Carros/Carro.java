package ProjetoA.Carros;

import ProjetoA.Carros.Veiculo;

public class Carro extends Veiculo {
//Construtor da superclasse
    public Carro(String modelo, String marca, int ano, double preco) {
        super(modelo, marca, ano, preco);
    }

//sobrescrevendo o método exibirInfo
    @Override
    public void exibirInformacoes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() + " - Ano " + getAno() + " - Preço: R$" + getPreco());
    }



}
