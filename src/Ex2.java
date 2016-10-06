/**
 * Created by sk10271 on 06.10.2016.
 */
public class Ex2 {
    public static void main(String[] args){
        Dog Spot = new Dog();
        Dog Scruffy = new Dog();
        Spot.name = "Spot";
        Spot.says = "Ruff";
        Scruffy.name = "Scruffy";
        Scruffy.says = "Wurf";

        Dog Ray = new Dog();
        Ray.name = Spot.name;
        Ray.says = Spot.says;

        System.out.println("Dog " + Spot.name + " says " + Spot.says);
        System.out.println("Dog " + Scruffy.name + " says " + Scruffy.says);

        System.out.println(Ray.name==Scruffy.name);
        System.out.println(Ray.name.equals(Scruffy.name));

        System.out.println(Ray.name==Spot.name);
        System.out.println(Ray.name.equals(Spot.name));

        System.out.println(Ray.name + " " + Spot.name + " " + Scruffy.name);
    }
}

class Dog{
    String name, says;
}



