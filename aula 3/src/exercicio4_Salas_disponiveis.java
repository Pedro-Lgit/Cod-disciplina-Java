import java.util.Scanner;

public class exercicio4_Salas_disponiveis {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numAlunos, mat;

        System.out.println("Entre com o numero de alunos: ");
        numAlunos = entrada.nextInt();          //entrada dos alunos feita


            switch (numAlunos){
                case 10:
                    System.out.println("predio 1 - sala 16");
                    break;
                case 20:
                    System.out.println("predio 1 - sala 16");
                    break;
                case 30:
                    System.out.println("predio 1 - sala 22");
                    break;

            }

        if(numAlunos != 10 && numAlunos != 20 && numAlunos !=30) {
            System.out.println("Use a estrutura Switch-case! ");
        }
        entrada.close();
    }
}
