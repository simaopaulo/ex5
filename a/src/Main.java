public class Main {
    public static void main(String[] args) {
        System.out.println("--- Carro ---");
        Carro carro = new Carro("BMW", 2000, 4, false);
        carro.mover();
        carro.modoAcelerar();
        carro.parado();
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Descapotável: " + carro.isDescapotavel());

        System.out.println("\n--- Mota ---");
        Mota mota = new Mota("Yamaha", 600, 2);
        mota.mover();
        mota.modoAcelerar();
        mota.parado();
        System.out.println("Marca: " + mota.getMarca());
        System.out.println("Cilindros: " + mota.getCilindros());
    }
}
