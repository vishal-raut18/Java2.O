package LearnJava;
/*
       Composition — “Has-a” instead of “Is-a” (very Java-ish)
       Instead of inheriting, you wrap another class and delegate work to it.

       Java does not support class inheritance without extends, 
       but similar behavior can be achieved using interfaces, composition, and delegation.
       Composition is often preferred over inheritance for better flexibility and maintainability.
*/
class Enginee{
     String model="BMW";
    void start(){
        System.out.println("Enginee is Started ..");
    }
}
class car {
    private Enginee e=new Enginee();
    void start(){
        System.out.println("Model of car is "+e.model);
        e.start();
    }
}

public class Inheritance_Composition {
    public static void main(String[] args) {
        car c=new car();
        c.start();
    }
}
