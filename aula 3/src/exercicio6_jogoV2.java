import java.util.Random;
import java.util.Scanner;

public class exercicio6_jogoV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int numero;
        int x = rand.nextInt(10)+1;
        boolean p = true;

        System.out.println("Iniciando o jogo do acerto: ");         //saida de dados
        System.out.println("Qual número foi gerado? "); //saida de dados

        do{           //quero que isso se repita até o usuario acertar o numero
            numero = entrada.nextInt();                 //entrada de dados feita

            if(numero == x){
                System.out.println("Voce acertou o numero!!!");
                p = false;

            }else{
                if(numero < x){
                    System.out.println("O numero "+numero+" é menor que o valor correto!!!");
                }else{
                    System.out.println("O numero "+numero+" é maior que o valor correto");
                }

            }

        }while(p);
        entrada.close();
    }
}