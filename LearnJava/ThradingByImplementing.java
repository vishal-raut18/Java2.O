package LearnJava;

class MyThread2 implements Runnable {
    public void run(){
       System.out.println("Thrad Using Runnable Class....... "+Thread.currentThread().getName()) ;
       System.out.println(Thread.currentThread().getState());
  
    }
}
public class ThradingByImplementing {
    public static void main(String[] args) {
      MyThread2 mythread=new MyThread2();
      
      Thread t1=new Thread(mythread );
    System.out.println(t1.getState());
  
      Thread t2=new Thread(mythread);
      t1.start();
      System.out.println(t1.getState());
      t2.start();
    }
}
