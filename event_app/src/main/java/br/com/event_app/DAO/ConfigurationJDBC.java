//package br.com.event_app.DAO;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class ConfigurationJDBC {
//
//    private String driverDataBase;
//    private String urlDataBase;
//    private String userName;
//    private String userPassword;
//
//    public ConfigurationJDBC(String driverDataBase, String urlDataBase, String userName, String userPassword) {
//        this.driverDataBase = driverDataBase;
//        this.urlDataBase = urlDataBase;
//        this.userName = userName;
//        this.userPassword = userPassword;
//    }
//
//    public ConfigurationJDBC() {
//        this.driverDataBase = "org.h2.Driver";
//        this.urlDataBase = "jdbc:h2:~/test";
//        this.userName = "sa";
//        this.userPassword = "";
//    }
//
//    public Connection getConnection(){
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(this.urlDataBase, this.userName, this.userPassword);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return connection;
//    }
//}
