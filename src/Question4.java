/*4. WAP to create singleton class.*/

public class Question4 {
    public static void main(String[] args) {
       Abc obj=Abc.getInstance();
       Abc obj1=Abc.getInstance();
       if(obj==obj1){
           System.out.println("Singleton class Abc");
       }
    }
}


