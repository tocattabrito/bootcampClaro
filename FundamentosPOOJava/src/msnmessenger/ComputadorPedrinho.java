package msnmessenger;

import apps.Facebook;
import apps.MSNMensseger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        // Não se sabe qual APP
        // mas qualquer um deverá enviar e receber mensagem
         String appEscolhido = "facebook";

         if(appEscolhido.equals("msn")) {
             smi = new MSNMensseger();
         } else if (appEscolhido.equals("facebook")) {
             smi = new Facebook();
         } else if(appEscolhido.equals("telegram")){
             smi = new Telegram();
         }
         smi.enviarMensagem();
         smi.receberMensagem();

    }
}
