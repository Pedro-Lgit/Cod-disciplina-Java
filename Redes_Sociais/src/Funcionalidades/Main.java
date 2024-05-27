package Funcionalidades;
import Exceçoes.Unchecked;

public class Main {
    public static void main(String[] args) {
        //Criando um Facebook, Twitter, Instagram,GooglePlus
        Facebook facebook = new Facebook();

        Twitter twitter = new Twitter();

        Instagram instagram = new Instagram();

        GooglePlus googlePlus = new GooglePlus();


        //Atribuindo valores

        //Facebook
        facebook.senha = "K0987h";
        facebook.numeroDeAmigos = 270;

        //Twitter
        twitter.senha = "j8379hfd";
        twitter.numeroDeAmigos = 24;

        //Instagram
        instagram.senha = "n83724hd";
        instagram.numeroDeAmigos = 400;

        //GooglePlus
        googlePlus.senha = "87213j";
        googlePlus.numeroDeAmigos = 15;

        //Criando redesSociais
        RedeSocial[] redesSociais = new RedeSocial[2];
        redesSociais[0] = facebook;
        redesSociais[1] = instagram;

        //criando usuario com duas redes
        Usuario user = new Usuario(redesSociais);

        //Definindo os atributos
        user.setNome("Pedro");
        user.setEmail("pedro.correia@get.inatel.br");


        try{
            ((Instagram)user.getRedes()[0]).postarComentario();
            user.getRedes()[0].postarVideo();
            user.getRedes()[0].curtirPublicacao();

            ((Facebook) user.getRedes()[1]).fazStreaming();
            user.getRedes()[1].postarFoto();
            user.getRedes()[1].postarComentario();
        }
        catch (Unchecked e){
            e.printStackTrace();
        }
    }
}