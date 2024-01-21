package designpatterns.singleton;



    /*
    --------------------------------------------------
                FINAL SOLUTION
    --------------------------------------------------
     */

import javax.xml.crypto.Data;

public class DatabaseConnectionV7 {

    private static DatabaseConnectionV7 dbC = null;

    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV7() {

    }


    public static DatabaseConnectionV7 getInstance(){
        if(dbC==null){
            // synchronized (dbC) { This can lead to Null pointer if dbc is not initialized.

            // This will allow only one thread to enter the synchronized block of code for
            // DatabaseConnectionV7 class.
            // In java, every class has a Class object associated with it, hence this works.
            synchronized (DatabaseConnectionV7.class) {
                if(dbC==null){
                    dbC = new DatabaseConnectionV7();
                }
            }
        }
        return dbC;
    }


}
