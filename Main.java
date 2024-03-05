import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        System.out.println("Vida do zumbi1: "+z1.mostraVida());
        System.out.println("Vida do zumbi2: "+z2.mostraVida());

        z1.transfereVida(z2,75);

        System.out.println("A nova vida do z2 é: "+z2.mostraVida());
        System.out.println("A nova vida do z1 é: "+z1.mostraVida());


    }
}