package ChocolateBoiler;

public class ChocolateBoilerSingleton {
        private boolean empty;
        private boolean boiled;
        private static ChocolateBoilerSingleton instance;

        public static ChocolateBoilerSingleton getInstance() {
            if (instance == null){
                instance = new ChocolateBoilerSingleton();
            }
            return instance;
        }

    public void print() {
        System.out.println("Empty = " + empty + ". Boiled = " + boiled);
    }


    private ChocolateBoilerSingleton() {
            empty = true;
            boiled = false;
        }

        public void fill(){
            if(isEmpty()){
                empty = false;
                boiled = false;
            }
        }

        public void drain(){
            if(!isEmpty() && isBoiled()){
                //drain the boiled milk and chocolate
                empty = true;
            }
        }

        public void boil(){
            if(!isEmpty() && !isBoiled()){
                //bring the contents to a boil
                boiled = true;
            }
        }

        public boolean isEmpty(){
            return empty;
        }

        public boolean isBoiled(){
            return boiled;
        }
}
