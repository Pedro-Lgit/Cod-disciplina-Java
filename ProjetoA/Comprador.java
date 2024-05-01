package ProjetoA;

import ProjetoA.Carros.Veiculo;

import java.util.Scanner;

public class Comprador {
    private String nome;
    private String cpf;
    private double saldoDisponivel;

//Construtor utilizado para inicialização
    public Comprador(String nome, String cpf, double saldoDisponivel) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldoDisponivel = saldoDisponivel;
    }

    // Método para realizar uma compra
    public void realizarCompra(Veiculo veiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja comprar o carro " + veiculo.getMarca() + " " + veiculo.getModelo() + " por R$" + veiculo.getPreco() + "? (s/n)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            if (saldoDisponivel >= veiculo.getPreco()) {    //condição para o saldo, para comprar um carro vc deve ter um valor igual ou maior do que o valor do carro
                System.out.println("Compra realizada com sucesso!");
                System.out.println(nome+" você acaba de adquirir um "+veiculo.getModelo());
                System.out.println("Obrigado por comprar em nossa plataforma... ");
                saldoDisponivel -= veiculo.getPreco();
            } else {
                System.out.println("Saldo insuficiente para realizar a compra.");
            }
        } else {
            System.out.println("Compra cancelada.");
        }
    }
}
