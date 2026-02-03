package LearnJava;

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
