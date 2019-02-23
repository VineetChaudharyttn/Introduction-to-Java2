/*8. WAP to read words from the keyboard until the word done is entered. For each word except
done, report whether its first character is equal   to  its last character. For the required loop, use a  */
import java.util.Scanner;


public class Question8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
//        a)while statement
        while(!word.equals("done")) {
            if(word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equal : " + word);
            } else {
                System.out.println("First and last character are NOT equal : " + word);
            }
            word = keyboard.next();
        }

//        b)do-while statement

//        do {
//            if(word.charAt(0) == word.charAt(word.length() - 1)) {
//                System.out.println("First and last character are equal: " + word);
//            } else {
//                System.out.println("First and last character are NOT equal : " + word);
//            }
//            word = keyboard.next();
//        } while(!word.equals("done"));
    }
}
