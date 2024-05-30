import java.util.ArrayList;

public class LoopThroughAnArraylist {
    public static void main(String args[]){
        ArrayList<String> bikes = new ArrayList<String>();
                bikes.add("Activa");
                bikes.add("enfeild");
                bikes.add("pulser");
                bikes.add("java");
                for(int i=0;i<bikes.size();i++){
                    System.out.println(bikes.get(i));
                }
    }
}
