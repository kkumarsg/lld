package exceptions.batch1;

public class Signup {

    static boolean emailExists(String email) throws InvalidEmailException {
        if(email.length()<5){
            throw new InvalidEmailException();
        }
        return true;
    }

    static boolean emailValidator(String email)  {
        if(email.length()<5){
            throw new InvalidEmailRuntimeException();
        }
        return true;
    }


    public static void main(String[] args) throws InvalidEmailException {
        System.out.println("emailExists(\"pranav@scaler.com\") = " + emailExists("pranav@scaler.com"));
//        System.out.println("emailExists(\"abc\") = " + emailExists("abc"));

        emailValidator("abc");
    }
}
