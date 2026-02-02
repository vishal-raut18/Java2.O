package LearnJava;

class A{
    int x=10;
    public void show(){
        System.out.println("This is show in A");
    }
}
class B extends A{
    int x=99;
    @Override
    public void show(){
        //super.show();
        System.out.println("This is show in B");
        System.out.println("Value of x:"+super.x);
    }
}
class C extends A{
    int x=10;
    public void show(){
        System.out.println("am in a show in c method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
         
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
       
        A ref=obj1;
        //ref.show();

         ref=obj2;
         ref =obj3;
         ref.show();


        
    }
    
}
