import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //======================================================================================================
        //instanciando os computadores.

        Computador computador1 = new Computador();          //criando um computador
        Computador computador2 = new Computador();          //      ''      ''
        Computador computador3 = new Computador();          //      ''      ''

        computador1.nome = "Positivo";
        computador2.nome = "Acer";
        computador3.nome = "Vaio";

        computador1.preço = 3300f;
        computador2.preço = 8800f;
        computador3.preço = 4800f;
    //========================================================================================================
        //instanciando HardwareBasico

        computador1.basic[0] = new HardwareBasico("pentium",2200f);   //utilizando um construtor para
        computador1.basic[1] = new HardwareBasico("memoria ram", 8f);
        computador1.basic[2] = new HardwareBasico( "HD", 500f);

        computador2.basic[0] = new HardwareBasico("Pentium Core i5",3370f);
        computador2.basic[1] = new HardwareBasico("Memoria Ram", 16f);
        computador2.basic[2] = new HardwareBasico("HD *Tb", 1f);

        computador3.basic[0] = new HardwareBasico("Pentium Core i7", 4500f);
        computador3.basic[1] = new HardwareBasico("Memória RAM", 32f);
        computador3.basic[2] = new HardwareBasico("HD *Tb", 2f);
    //==========================================================================================================
        //instanciando sistemasOperacionais

        computador1.sistemcomp.nome = "Sistema Operacional Linux Ubuntu";
        computador1.sistemcomp.tipo = 32;

        computador2.sistemcomp.nome = "Sistema Operacional Windows 8";
        computador2.sistemcomp.tipo = 64;

        computador3.sistemcomp.nome = "Sistema Operacional Windows 10";
        computador3.sistemcomp.tipo = 64;

    //=========================================================================================================
        //instanciando memória USB

        MemoriaUSB pendrive1 = new MemoriaUSB();
        computador1.addMemoriaUSB(pendrive1);

        MemoriaUSB pendrive2 = new MemoriaUSB();
        computador2.addMemoriaUSB(pendrive2);

        MemoriaUSB pendrive3 = new MemoriaUSB();
        computador3.addMemoriaUSB(pendrive3);

        pendrive1.nome = "Acompanha Pen-drive de ";
        pendrive1.capacidade = 16;
        pendrive2.nome = "Acompanha Pen-drive de ";
        pendrive2.capacidade = 32;
        pendrive3.nome = "Acompanha HD Externo";
        pendrive3.capacidade = 1;   //Tb

        Cliente clientes = new Cliente("Pedro", 15212312456787L);

    //=========================================================================================================
    // inicio da logica sistema de compras
        Scanner entrada = new Scanner(System.in);           //entrada de dados do cliente

        int op;
        float somaTotal = 0.0f;

        do{
            System.out.println("Bem-vindo a PC Mania");
            System.out.println("Escolha um opção");
            System.out.println("[1] -> Comprar PC da promoção 1");
            System.out.println("[2] -> Comprar PC da promoção 2");
            System.out.println("[3] -> Comprar PC da promoção 3");
            System.out.println("[0] -> Para sair e calcular o total da compra");
            System.out.println();
            System.out.print("opcão: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    for (int i = 0; i < clientes.computadores.length; i++) {
                        if (clientes.computadores[i] == null) {
                            clientes.computadores[i] = computador1;
                            break;

                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < clientes.computadores.length; i++) {
                        if (clientes.computadores[i] == null) {
                            clientes.computadores[i] = computador2;
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < clientes.computadores.length; i++) {
                        if (clientes.computadores[i] == null) {
                            clientes.computadores[i] = computador3;
                            break;

                        }
                    }
                    break;
            }

        }while(op != 0);
        //mostrar info da compra
        System.out.println("Informações Do Cliente");
        System.out.println("Nome: " + clientes.nome);
        System.out.println("CPF: " + clientes.cpf);
        System.out.println("--------------------------------------------------------------");

        //mostrar info dos PCS
        System.out.println("PCs Adquiridos");
        for (int i = 0; i < clientes.computadores.length; i++) {
            if(clientes.computadores[i] != null){
                clientes.computadores[i].mostraPCCnfigs();

            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Valor total: "+ clientes.calculaTotalCompra());

    }
}