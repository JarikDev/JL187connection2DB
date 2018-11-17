package com;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         String userName="root";
         String password = "sql123";
         String connectionUrl="jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
         Class.forName("com.mysql.jdbc.Driver");
         try(Connection connection= DriverManager.getConnection(connectionUrl,userName,password)){
             System.out.println("We're connected");
         }

    }
}


























