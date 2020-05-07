package ChocolateBoiler;

public class ChocolateBoilerSingletonTest {
    public static void main(String[] args){
        //Instanciando dos objetos que apuntan al mismo objeto dentro de la clase
        //ChocolateBoilerSingleton
        ChocolateBoilerSingleton instancia1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton instancia2 = ChocolateBoilerSingleton.getInstance();

        //Haciendo fill y boil a ambas instancias, pero en si, se le hace al objeto
        //dentro de la clase ChocolateBoilerSingleton
        instancia2.fill();
        instancia1.boil();

        //Imprimiendo ambas instancias (siempCre imprimen lo mismo)
        System.out.print("Instancia1: ");
        instancia1.print();
        System.out.print("Instancia2: ");
        instancia2.print();

    }
}
