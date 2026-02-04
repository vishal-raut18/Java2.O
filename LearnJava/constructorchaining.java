package LearnJava;

class students{
    int age;
    String name;
    int rollno;
    students(){
        this(1,"vishal",22);

      System.out.println("Default constructor");
    }
    students(int rollno,String name,int age){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
          System.out.println("Parameterized constructor");
    }
    public void info(){
        System.out.println("name: "+name +"  ROll No: "+rollno +" Age: "+age );
    }
}
public class constructorchaining {
    public static void main(String[] args) {
           students s=new students();
           s.info();
           StringBuilder sb1 = new StringBuilder("abc");
StringBuilder sb2 = new StringBuilder("abc");;
System.out.println(sb1 == sb2);
System.out.println(sb1.equals(sb2));

System.out.println(sb1.toString().equals(sb2.toString()));
    }

 
 

}
