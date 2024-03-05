public class Zumbi {
    double vida; //atributo
    String nome;

    double mostraVida(){  //método
        return this.vida;
    }
    void transfereVida(Zumbi zumbiAlvo, double quantia){
        zumbiAlvo.vida += quantia;
        vida -= quantia;

    }

}