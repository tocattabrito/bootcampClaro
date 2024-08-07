package veiculos;

public class Carro extends Veiculo{

    public void ligar() {
        confereCambio();
        conferindoCombustivel();
        System.out.println("CARRO LIGADO");
    }

    // métodos encapsulados
    private void conferindoCombustivel() {
        System.out.println("conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("conferindo cambio em P");
    }

}
