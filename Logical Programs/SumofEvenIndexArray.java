import java.util.HashMap;

public class SumofEvenIndexArray {
    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        HashMap<Integer, Integer> val = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]+" , "+i);
            System.out.println(array[array.length-1-i]+" "+(array.length-i-1));
//            int a = 10;
//            int b =20;
//            int c = a+b;
//            System.out.println(""+c);
//            double d = 10.5;
//            int o =(int)d;
//            System.out.println(o);
//            int w = 12;
//            float f = w;
//            System.out.println(f);
//            char[] chars = {'a','b','c','d'};
//            String str = new String(chars);
//            System.out.println(str);
//            String str = new String("hello,world");
//            System.out.println(str);
//            int a=10,b=20;
//            int max =(a<=b)?a:b;
//            System.out.println(max);
        }
    }
}
//            val.put(array[i], i);
//        }
//        System.out.println(val.get(7));
//        System.out.println(val.get(3));
//    }
//}

//        int sum = sumofEvenIndexes(array);
//        System.out.println("Sum of even index of array:"+sum);
//    }
//    public static int sumofEvenIndexes(int[]array){
//        int sum = 0;
//        for(int i=0; i<array.length; i+=2){
//            sum+=i;
//        }
//        return sum;
//    }
//}
