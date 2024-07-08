public class ConstructorBike {         //Class
    String name;
    String model;
//    public  ConstructorBike(){       //constructor chaining
//        this("hiugyugy","vytyytf");
//        System.out.println("ki,k,");
//    }
//    class Name{
//        public  ConstructorBike(){
//
//        }
//    }
    public ConstructorBike(String name,String model){        //constructors with parameters
        this.name=name;
        this.model=model;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){        //method
        System.out.println("Brand : "+name);
        System.out.println("Year : "+model);
    }

    public static void main(String[] args) {
//        ConstructorBike con = new ConstructorBike();
        ConstructorBike con1 = new ConstructorBike("Enfeild","2019"); //object creation
        con1.display(); //method calling
        System.out.println(con1.getName());
       con1.setName("virat");
        System.out.println("updated:"+con1.getName());
    }
}
