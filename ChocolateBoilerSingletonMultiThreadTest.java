package ChocolateBoiler;

class MultiThreadTest extends Thread {
    int id;

    public MultiThreadTest(int x) {
        id = x;
    }

    ChocolateBoilerSingleton instancia1 = ChocolateBoilerSingleton.getInstance();

    public void run() {


        if (id%2 == 0) {
            instancia1.fill();
            instancia1.boil();
            System.out.println("El thread con id " + id + " tiene: empty: " + instancia1.isEmpty() + ". Boiled: " + instancia1.isBoiled());
        } else {
            instancia1.drain();
            System.out.println("El thread con id " + id + " tiene: empty: " + instancia1.isEmpty() + ". Boiled: " + instancia1.isBoiled());
        }
    }
}

public class ChocolateBoilerSingletonMultiThreadTest {
    public static void main(String[] args) throws InterruptedException {
        int threads = 4;

        for (int i = 0; i < threads; ++i) {
            MultiThreadTest tester = new MultiThreadTest(i);
            tester.start();
        }
        Thread.sleep(1500);
        
        //Siempre es igual al ultimo thread que se ejecute (no necesariamente el ultimo que se imprime)
        ChocolateBoilerSingleton instancia1 = ChocolateBoilerSingleton.getInstance();
        System.out.println("Empty: " + instancia1.isEmpty() + ". Boiled: " + instancia1.isBoiled());

    }
}