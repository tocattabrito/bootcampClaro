package veiculos;

public abstract class Veiculo {

    private String chassi;

    public java.lang.String getChassi() {
        return chassi;
    }

    public void setChassi(java.lang.String chassi) {
        this.chassi = chassi;

    }
    public abstract void ligar();
}
