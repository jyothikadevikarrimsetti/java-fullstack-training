public enum EnumsCurrency {
    INR(80),
    USD(1),
    IQD(1310),
    KD(0.30);
    public double value;   //Create variable
    public int jyo;
    EnumsCurrency(double value){
        this.value = value ;

    }
    EnumsCurrency(int jyo){
        this.jyo = jyo;
    }
    public double getValue(){
//        System.out.println("dtyyt");
        return value;
    }
    public int getJyo(){
        return jyo;
    }
    public int jyo(){
        System.out.println("jyo");
        return jyo;
    }

    public static void main(String[] args) {
        System.out.println(EnumsCurrency.KD);
        System.out.println(EnumsCurrency.KD.getValue());
        System.out.println(EnumsCurrency.INR.getValue());
        System.out.println(EnumsCurrency.USD.getValue());
        System.out.println(EnumsCurrency.IQD.getValue());
//        System.out.println(EnumsCurrency.INR.jyo());
    }

}
