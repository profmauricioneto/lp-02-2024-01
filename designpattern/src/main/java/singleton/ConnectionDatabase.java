package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static ConnectionDatabase instance = null;
    private Connection connection;
    private String username = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/dbtest";

    private ConnectionDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url,
                    username, password);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Conexão falhou. Erro: " +
                    e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static ConnectionDatabase getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionDatabase();
        }
        return instance;
    }

    public static void main(String[] args) {
        ConnectionDatabase conn;
        try {
            conn = ConnectionDatabase.getInstance();
            System.out.println("Conexão singleton chamada...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
