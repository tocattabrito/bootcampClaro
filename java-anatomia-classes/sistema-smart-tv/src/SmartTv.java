public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarcanal() {
        canal++;
    }

    public void diminuircanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentado o volume para: " + volume);
    }

    public void deminuirVolume() {
        volume--;
        System.out.println("Diminuido o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
