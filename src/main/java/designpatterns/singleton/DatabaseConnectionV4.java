package designpatterns.singleton;

public class DatabaseConnectionV4 {

    private static DatabaseConnectionV4 dbC = null;
    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV4() {
    }

    public static DatabaseConnectionV4 getInstance(){
        if(dbC==null){
            dbC = new DatabaseConnectionV4();
        }
        return dbC;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
