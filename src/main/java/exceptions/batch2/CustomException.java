package exceptions.batch2;

public class CustomException {

    static boolean emailExists(String email) throws EmailTooShortException {

        if(email.length()<5){
            throw new EmailTooShortException();
        }
        return true;
    }

    public static void main(String[] args) throws EmailTooShortException {
        emailExists("abc");
    }
}
