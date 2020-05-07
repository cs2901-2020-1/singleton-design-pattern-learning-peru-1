package ChocolateBoiler;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        //Instanciando dos objetos
        ChocolateBoiler instancia1 = new ChocolateBoiler();
        ChocolateBoiler instancia2 = new ChocolateBoiler();

        instancia2.fill();
        instancia2.boil();
        instancia1.drain();

        System.out.print("Instancia1: ");
        instancia1.print();
        System.out.print("Instancia2: ");
        instancia2.print();
    }
}
