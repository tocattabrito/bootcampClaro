package veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("895623");
        //jeep.ligar();

        Moto CB400 = new Moto();
        CB400.setChassi("456131");
        //CB400.ligar();

        Veiculo coringa = CB400;
        coringa.ligar();
    }
}
