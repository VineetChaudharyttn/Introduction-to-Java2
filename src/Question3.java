/*3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.*/

public class Question3 {

    public static void main(String[] args) {
        try {
            Class.forName("test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // The following line would throw ExceptionInInitializerError
            SimpleCalculator calculator1 = new SimpleCalculator();
        } catch (Throwable t) {
            System.out.println(t);
        }
        // The following line would cause NoClassDefFoundError
        SimpleCalculator calculator2 = new SimpleCalculator();
    }
}


