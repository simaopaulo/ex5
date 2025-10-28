public class Veiculo extends EstadoVeiculo {
    private String marca;
    private int cilindrada;

    public Veiculo(String marca, int cilindrada) {
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void modoAcelerar() {
        System.out.println("O veículo está a acelerar.");
    }

    @Override
    public void mover() {
        System.out.println("Veículo a andar");
    }

    @Override
    public void parado() {
        System.out.println("Veículo parado");
    }
}
