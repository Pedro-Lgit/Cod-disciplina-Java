import java.util.Scanner;

public class exercicio3_if_entrada_dados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int np3, npa;

        System.out.println("Digite a nota NPA: ");      //saida de dados
        npa = entrada.nextInt();            //entrada de dados

        if(npa >= 60){
            System.out.println("Deu bom!!");

        }
        else{
            System.out.println("Ainda tem como....");   //saida de dados
            System.out.println("digite a nota NP3:");
            np3 = entrada.nextInt();                    //entrada de dados
            if((np3+npa)/2 >= 50){
                System.out.println("Aprovado, deu bom!");
            }
            else{
                System.out.println("tente novamente semestre que vem.");
            }

        }
        entrada.close();
    }
}
