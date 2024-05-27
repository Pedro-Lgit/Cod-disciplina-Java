package Funcionalidades;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("Você compartilhou no Twitter!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentario no Twitter!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Você curtiu uma publicação no Twitter!");
    }
}