package com.gestion.gestionstation.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSql {
    private String url;
    private String username;
    private String  password;

    public ConnectSql(String url, String username, String password) {
        this.url = System.getenv("URL");
        this.username = System.getenv("USERNAME");
        this.password = System.getenv("PASSWORD");
    }

public Connection Createconnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(url,username,password);

        return connection;
}
}
