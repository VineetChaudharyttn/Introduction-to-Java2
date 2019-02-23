/*6. WAP showing try, multi-catch and finally blocks.*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int a,b,arr[]=new int[5];
        float res;
        Scanner sc =new Scanner(System.in);
        Question6 obj=new Question6();
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            res=obj.div(a,b);
            System.out.println(res);
            res=arr[5];
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Execption:- b cannot be zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Execption");
        }
        finally {
            System.out.println("In finally");
        }



    }
    public float div(int a,int b){
        return a/b;
    }
}
