public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean descapotavel;

    public Carro(String marca, int cilindrada, int numeroPortas, boolean descapotavel) {
        super(marca, cilindrada);
        this.numeroPortas = numeroPortas;
        this.descapotavel = descapotavel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public boolean isDescapotavel() {
        return descapotavel;
    }

    @Override
    public void modoAcelerar() {
        System.out.println("O carro acelera suavemente com o pedal.");
    }
}