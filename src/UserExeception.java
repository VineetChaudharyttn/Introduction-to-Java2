public class UserExeception extends Exception {

    public UserExeception(String msg){
        super(msg);
    }

    @Override
    public void printStackTrace() {
        System.out.println(getMessage());
    }
}