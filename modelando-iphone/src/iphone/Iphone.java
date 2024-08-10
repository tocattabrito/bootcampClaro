package iphone;

import nagevadorinternet.NavegadorNaInternet;
import reprodutormusical.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone {

    public static void main(String[] args) {

        IphoneFuncionalidades iphoneFunc = new IphoneFuncionalidades();

        ((ReprodutorMusical) iphoneFunc).exibirTitulo("REPRODUTOR MUSICAL");
        ((ReprodutorMusical) iphoneFunc).tocar();
        ((ReprodutorMusical) iphoneFunc).pausar();
        ((ReprodutorMusical) iphoneFunc).selecionarMusica(": CONFIANÇA - OS ORIGINAIS DO SAMBA");
        ((ReprodutorMusical) iphoneFunc).tocar();

        ((AparelhoTelefonico) iphoneFunc).exibirTitulo("APARELHO TELEFÔNICO");
        ((AparelhoTelefonico) iphoneFunc).ligar("(81) 98956-0918");
        ((AparelhoTelefonico) iphoneFunc).atender();
        ((AparelhoTelefonico) iphoneFunc).iniciarCorreioVoz();

        ((NavegadorNaInternet) iphoneFunc).exibirTitulo("NAVEGADOR DE INTERNET");
        ((NavegadorNaInternet) iphoneFunc).exibirPagina("https://www.dio.me/users/tocattabrito");
        ((NavegadorNaInternet) iphoneFunc).adicionarNovaAba();
        ((NavegadorNaInternet) iphoneFunc).atualizarPagina();
    }
}
