public enum EnumsCurrency {
    INR(80),
    USD(1),
    IQD(1310),
    KD(0.30);
    private double value;
    EnumsCurrency(double value){
        this.value = value ;
    }
    public double getValue(){
        return value;
    }

    public static void main(String[] args) {
        System.out.println(EnumsCurrency.KD);
        System.out.println(EnumsCurrency.KD.getValue());
        System.out.println(EnumsCurrency.INR.getValue());
        System.out.println(EnumsCurrency.USD.getValue());
        System.out.println(EnumsCurrency.IQD.getValue());
    }

}
