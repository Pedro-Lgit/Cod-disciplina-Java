public class Computador {

    String nome;            //Marca!
    float preço;
    MemoriaUSB memoriaUSB;
    HardwareBasico [] basic = new HardwareBasico[3];
    SistemaOperacional sistemcomp;


    void mostraPCCnfigs(){

        System.out.println("Info do PC");
        System.out.println("Marca: "+this.nome);
        System.out.println("Preço: "+this.preço);

        for (int i = 0; i < basic.length; i++) {
           if(basic[i] != null){
                System.out.println("Nome do HW: "+basic[i].nome);
                System.out.println("Capacidade do HW: "+basic[i].capacidade);
                System.out.println("");

            }
        }
        System.out.println("Sistema op: "+this.sistemcomp.nome+" "+this.sistemcomp.tipo+" (bits)");
        System.out.println("Memoria USB: "+this.memoriaUSB.nome);
        System.out.println("Capacidade da memoria usb: "+this.memoriaUSB.capacidade);

    }

    void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }



    public Computador() {
        sistemcomp = new SistemaOperacional();

    }
}
