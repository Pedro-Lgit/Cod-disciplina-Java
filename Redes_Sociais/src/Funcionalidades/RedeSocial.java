package Funcionalidades;

public abstract class RedeSocial {

    protected String senha;
    protected int numeroDeAmigos;


     public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

   public void curtirPublicacao(){
       System.out.println("Você curtiu uma publicação!! ^_^ ");
    }


}
