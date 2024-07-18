class Single{
    private static  Single instance = new Single();
        private Single(){

        }
        public static Single getInstance(){
            return instance;
        }
    }

public class Singleton{
    public static void main(String[] args) {
        System.out.println(Single.getInstance());
    }
}