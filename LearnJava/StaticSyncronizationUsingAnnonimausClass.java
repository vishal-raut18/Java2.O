package LearnJava;

class PrintTable{

    public static synchronized void print(int n){
          System.out.println("Table Of :"+n);
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
public class StaticSyncronizationUsingAnnonimausClass {
    public static void main(String[] args) {
       
        Thread t1=new Thread(){
            public void run(){
                PrintTable.print(1);
            }
        };

        Thread t5=new Thread(()->{
                PrintTable.print(5);
            
        });
        Thread t10 = new Thread(() -> PrintTable.print(10));

        t1.start();
        t5.start();
        t10.start();

        }
}
