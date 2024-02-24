import java.util.Random;
import java.util.Scanner;

public class exercicio5_jogo {
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
                System.out.println("Tente outra vez");
            }

        }while(p);
        entrada.close();
    }
}
