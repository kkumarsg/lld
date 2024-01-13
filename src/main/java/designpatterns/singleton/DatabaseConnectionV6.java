package designpatterns.singleton;

public class DatabaseConnectionV6 {

    private static DatabaseConnectionV6 dbC = null;

    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV6() {
    }

    public static synchronized DatabaseConnectionV6 getInstance(){
        if(dbC==null){
            dbC = new DatabaseConnectionV6();
        }
        return dbC;
    }
}
