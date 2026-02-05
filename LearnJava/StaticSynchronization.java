package LearnJava;
class Print {

    public static  synchronized void printMsg(String s){
        for(int i=1;i<=5;i++){
        System.out.print("Good Morning : ");
        System.out.println(s);
        try{  
                Thread.sleep(1000);  //sleep thread for 1 sec  
            }  
            catch(InterruptedException e)  
            {  
            }  
        }
    }
}
class MyThread3 extends Thread{
 
   Print  print ;
   String name;
    MyThread3(Print print, String name){
        this.print=print;
        this.name=name;
    }
    public void run(){
        print.printMsg(name);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        
        Print print =new Print();
         Print print1 =new Print();
        MyThread3 th1=new MyThread3(print, "Vishal");
        MyThread3 th2=new MyThread3(print1, "Makdaa");
        th1.start();
        th2.start();
    }
}
