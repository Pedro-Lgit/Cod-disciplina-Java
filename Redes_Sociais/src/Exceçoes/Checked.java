package Exceçoes;

import java.io.IOException;

public class Checked extends IOException {
    public Checked (String mensagem){
        super(mensagem);
    }

}
