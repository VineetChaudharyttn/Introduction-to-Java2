/*Q13. Create a custom exception that do not have any stack trace.*/

public class Question13 {

    public static void main(String[] args) {
        try {
            throw new UserExeception("my Exeception");
        }
        catch (UserExeception e) {
            e.printStackTrace();
        }
    }
}


