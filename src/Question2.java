/*2. WAP to sorting string without using string Methods?.*/

import java.util.Scanner;

public class Question2 {
    public String stringSort(String str){
        char ch[]= new char[str.length()];
        int index=0,end=str.length()-1;
        str.toLowerCase();
        for(int i='a';i<='z';i++){
            for(int j=0;j<str.length();j++){
                if (str.charAt(j)==i) {
                   ch[index++]=(char)i;
                }
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String text;
        Scanner sc=new Scanner(System.in);
        Question2 obj=new Question2();
        text=obj.stringSort(sc.nextLine());
        System.out.println(text);
    }
}
