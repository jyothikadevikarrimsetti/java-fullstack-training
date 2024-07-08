class Planets{
   public String planetName ="Earth";
    public void Oceans(){
        System.out.println("Oceans are the part of earth");
    }
}
class Car extends Planets {
    public String otherPlanets = "jupyter";

    public static void main(String[] args) {
        Planets planets = new Planets();
        planets.Oceans();
        System.out.println(planets.planetName+" "+planets);
    }
}
