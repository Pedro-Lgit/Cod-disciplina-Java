package Funcionalidades;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void compartilhar() {
        System.out.println("Você compartilhou algo no Facebook!! ");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Você esta fazendo uma video conferencia no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Facebook!! ");
    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um video no Facebook!! ");
    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentario!! ");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Você curtiu uma publicação no Facebook!! ");
    }

}