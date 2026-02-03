package LearnJava;

class Animal {
     int x=10;
    void show(){
        System.out.println("Am i Aniaml class");
    }
}
class Dog extends Animal{
    void dogShow(){
        System.out.println("Am in a Dog Show "+x);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.dogShow();
        d.show();
    }
}
