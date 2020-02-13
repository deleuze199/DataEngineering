package io.github.deleuze199;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
// just to check if these are found

public class BookStoreDB {

  String Jdbc_Driver;
  String db_Url;
  String user;
  String pass;
  Connection conn;

  BookStoreDB() {
    setupDB();
  }

  public void setupDB() {
    try {
      Jdbc_Driver = "org.sqlite.JDBC";
      db_Url = "jdbc:sqlite:src/Data/BookStore.db";
      // Database credentials
      user = "";
      pass = "";
      // Register JDBC driver
      Class.forName(Jdbc_Driver);
      // Create a connection to database
      conn = DriverManager.getConnection(db_Url, user, pass);
      if (conn != null) {
        System.out.println("Connected to the database");
//        String testInsert = "INSERT INTO author(author_name, author_email, author_url) VALUES (?,?,?)";
//        PreparedStatement preparedStmt = conn.prepareStatement(testInsert);
//        preparedStmt.setString(1,"Test1");
//        preparedStmt.setString(2,"Test2");
//        preparedStmt.setString(3,"Test3");
//        preparedStmt.execute();
        conn.close();
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
