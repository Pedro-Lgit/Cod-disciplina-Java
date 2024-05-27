package Funcionalidades;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("Você compartilhou uma foto no Google+!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Google+!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um vídeo no Google+!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentario no Google+!");
    }

    @Override
    public void fazStreaming() {

        System.out.println("Você fazendo uma vídeo conferência no Google+!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Você curtiu uma publicação no Google+!");
    }
}