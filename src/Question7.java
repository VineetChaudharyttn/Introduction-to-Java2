/* 7. WAP to convert seconds into days, hours, minutes and seconds.*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        long sec,minute,hour,days;
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter the seconds:");
        sec=cs.nextLong();

        minute=sec/60;
        sec=sec%60;

        hour=minute/60;
        minute=minute%60;

        days=hour/24;
        hour=hour%24;



        System.out.println(" Days="+days+" hours="+hour+" min="+minute+" sec="+sec);
        
    }
}
