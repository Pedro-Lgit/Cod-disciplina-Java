package Funcionalidades;

import Funcionalidades.RedeSocial;

public class Instagram extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um vídeo no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentario no Instagram!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Você curtiu uma publicação no Instagram!");
    }
}

