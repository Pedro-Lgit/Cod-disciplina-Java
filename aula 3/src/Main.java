import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //entrada de dados

        //int meuInteiro = entrada.nextInt();    //funcao de entrada com inteiros

        System.out.println("Entre com o numero dos lanches da primeira hora: ");   //saida de dados
       int lanche1 = entrada.nextInt();

        System.out.println("Entre com o numero dos lanches da primeira hora: ");   //saida de dados
        int lanche2 = entrada.nextInt();

        System.out.println("Entre com o numero dos lanches da primeira hora: ");   //saida de dados
        int lanche3 = entrada.nextInt();

       int total = lanche1 + lanche2 + lanche3;
       float media = total/3.0f;

        System.out.println("Total de lanches: "+total);
        System.out.println("Média de lanches: "+media);

        entrada.close();

    }
}