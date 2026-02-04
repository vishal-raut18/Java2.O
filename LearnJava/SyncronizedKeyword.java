package LearnJava;
class Line{
   synchronized public  void getLine(){  //if we not use synchronized here it got get ouppt as in sequance 
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
}

class Train extends Thread  {
 
    Line line;
    public Train( Line line){
        this.line=line;
    }
    public void run(){
         line.getLine();
    }
    
}
public class SyncronizedKeyword {
    public static void main(String[] args) {
        Line line =new Line();

        Train t1=new Train(line);
        Train t3=new Train (line);
        t1.start();
       
        t3.start();
        }
}
