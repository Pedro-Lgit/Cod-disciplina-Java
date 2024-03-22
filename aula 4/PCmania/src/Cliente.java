public class Cliente {

    String nome;

    Computador [] computadores = new Computador [10];
    long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    float calculaTotalCompra(){
        float total =0.0f;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null){
                total += computadores[i].preço;
            }
        }
        return total;
    }
}
