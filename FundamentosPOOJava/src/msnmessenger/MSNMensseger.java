package msnmessenger;

public class MSNMensseger extends  ServicoMensagemInstantanea{
    @java.lang.Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @java.lang.Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
