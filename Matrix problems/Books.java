 class Library {
    String name;
    int num;
    private Library(String name,int num){
        this.name=name;
        this.num = num;

    }
    public Library(){

    }
    String get(){
        System.out.println(name+" "+num);
        return name+" "+num;

    }
}
 public class Books{
     Books(){


    }
    public static void main(String[] args) {
        Library l1 = new Library();
        System.out.println(l1.get());
//        Books b1 = new Books();
//
    }
}

