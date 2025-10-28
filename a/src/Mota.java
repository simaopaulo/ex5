public class Mota extends Veiculo {
    private int cilindros;

    public Mota(String marca, int cilindrada, int cilindros) {
        super(marca, cilindrada);
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }

    @Override
    public void modoAcelerar() {
        System.out.println("A mota acelera rapidamente com o punho.");
    }
}
