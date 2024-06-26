 class Adder {
     String word1;
     String word2;
     int num1;
     int num2;

     Adder(String word1, String word2) {
         this.word1 = word1;
         this.word2 = word2;

     }

     Adder(int num1, int num2) {
         this.num1 = num1;
         this.num2 = num2;
     }

     String getWord() {

         return word1 + word2;
     }

     int getNum() {

         return num1 + num2;
     }
 }

    public class Cons {
        public static void main(String[] args) {
            Adder add1=new Adder("jyo","devi");
            System.out.println(add1.getWord());
            Adder add2 = new Adder(23,456);
            System.out.println(add2.getNum());

        }
    }

