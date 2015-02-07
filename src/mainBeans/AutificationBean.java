package mainBeans;

import interfaces.ConnectionBidDB;

import java.io.Serializable;

public class AutificationBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /*
     *
     *
     *
     */
    private String user;
    private String password;
    private String ddd;
    private ConnectionBidDB dbConnection;

    public String testUser() {
        /* System.out.println("Its Work"); */
        // if (user.isEmpty()) {
        // return "";
        // } else {
        //
        // }
        // System.out.println("Все гуд");
        try {
            // System.out.println(dbConnection.getEntities());
        } catch (Exception e) {
            // System.out.println("Проблема + "+e);
        }
        return "outcome";
    }

    // ������������

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public ConnectionBidDB getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(ConnectionBidDB dbConnection) {
        this.dbConnection = dbConnection;
    }
}
