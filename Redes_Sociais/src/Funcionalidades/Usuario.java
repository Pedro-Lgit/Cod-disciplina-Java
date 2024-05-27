package Funcionalidades;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais;

    public Usuario(RedeSocial[] redesSociais){
        this.redesSociais = new HashSet<>();
        Collections.addAll(this.redesSociais, redesSociais);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedes(){
        return this.redesSociais.toArray(new RedeSocial[0]);
    }
}