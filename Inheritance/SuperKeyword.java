public class SuperKeyword {
    class one{
        int i = 10;
        void show()
        {
            System.out.println("super class method:i="+i);
        }
    }
    class two {
        int i = 20;
        void show()
        {
            System.out.println("Sub class method:i="+i);
        }
    }
    class super1
    {
        public void main(String args[]){
            two T = new two();
            T.show();
        }
    }
}
