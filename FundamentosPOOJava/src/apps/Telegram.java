package apps;

public class Telegram extends ServicoMensagemInstantanea {
    @java.lang.Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @java.lang.Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
