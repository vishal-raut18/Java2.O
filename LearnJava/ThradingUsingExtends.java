package LearnJava;

class MyThread extends Thread{

    public  void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        for(int j=100;j>=95;j--){
                System.out.println(j);
        }
    } 
}
public class ThradingUsingExtends {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();


    }
}
