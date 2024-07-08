class Food{
        class Rice{
        int i =90;

    }
}
public class NestedClass {
    public static void main(String[] args) {
        System.out.println(new Food().new Rice().i);
        Food food = new Food();
//        Food.Rice foodrice = food.new Rice();


    }
}
