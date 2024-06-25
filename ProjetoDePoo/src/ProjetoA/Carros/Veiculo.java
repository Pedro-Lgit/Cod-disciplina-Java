package ProjetoA.Carros;

public abstract class Veiculo {
//membros da classe
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Veiculo(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    // Método abstrato para exibir informações do veículo
    public abstract void exibirInformacoes();

    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }
}
