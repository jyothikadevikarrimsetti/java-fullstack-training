public class InstanceAndClassVariables {
    private int States;     // instance variable

    private static int andhraPradesh;   // class variable

    public InstanceAndClassVariables(){
        int States = 234;
        andhraPradesh++;
    }
    public void government(){
        States++;

    }

    public static void main(String[] args) {
        InstanceAndClassVariables instanceAndClassVariables1 = new InstanceAndClassVariables();
        InstanceAndClassVariables instanceAndClassVariables2 = new InstanceAndClassVariables();
        instanceAndClassVariables1.government();
        instanceAndClassVariables2.government();
        System.out.println(instanceAndClassVariables1.States);
        System.out.println(instanceAndClassVariables2.States);
        System.out.println(InstanceAndClassVariables.andhraPradesh);
    }

}
