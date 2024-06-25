package ProjetoA;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String message) {
        super(message);
    }
    //exceção não checada!, não preciso de um try/cath (Fazer o teste, comprando o carro 2)
}
