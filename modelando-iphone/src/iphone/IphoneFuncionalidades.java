package iphone;

import nagevadorinternet.NavegadorNaInternet;
import reprodutormusical.ReprodutorMusical;
import telefone.AparelhoTelefonico;



public class IphoneFuncionalidades implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    // Métodos da interface Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("REPRODUZINDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("REPRODUÇÃO PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO FAIXA" + musica);
    }

    @Override
    public void exibirTitulo(String titulo) {
        System.out.println();
        System.out.println("== "+titulo+" ==");

    }


    // Métodos da interface Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("DISCANDO PARA "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("ALÓ...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("VOCÊ TEM UMA NOVA MENSAGEM!");
    }




    // Métodos da interface Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBIDO PÁGINA " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

}
