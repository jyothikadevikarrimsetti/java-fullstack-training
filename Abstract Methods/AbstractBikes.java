abstract class bike{
    public abstract void bikeparts();
    public void fuel(){

        System.out.println("petrol");
    }
        }
        class name extends bike{
    public void bikeparts(){
        System.out.println("Pulser");
    }
        }
        class Main{
        public static void main(String args[]) {
            name n1 = new name();
            n1.bikeparts();
            n1.fuel();
        }
}