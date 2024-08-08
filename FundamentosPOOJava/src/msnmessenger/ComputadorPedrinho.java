package msnmessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        // Abrindo o MSN Messenger
        System.out.println("MESSENGER");
        MSNMensseger msn = new MSNMensseger();
        msn.enviarMensagem();
        msn.receberMensagem();

        // Abrindo o Facebook
        System.out.println("FACEBOOK");
        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        // Abrindo o Telegram
        System.out.println("TELEGRAM");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
