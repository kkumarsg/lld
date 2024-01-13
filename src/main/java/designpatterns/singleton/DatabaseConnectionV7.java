package designpatterns.singleton;



    /*
    --------------------------------------------------
                FINAL SOLUTION
    --------------------------------------------------
     */

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
            synchronized (dbC) {
                if(dbC==null){
                    dbC = new DatabaseConnectionV7();
                }
            }
        }
        return dbC;
    }

}
