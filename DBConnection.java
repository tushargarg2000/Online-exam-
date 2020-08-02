package OXS;

import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.exceptions.*;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection {
   private static Connection con = null;
   private static final String USERNAME = "root";
   private static final String PASSWORD = "admin";
   private static final String DRIVER = "com.mysql.jdbc.Driver";
   private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";

   public static Connection getDatabaseConnection() throws ClassNotFoundException{
       Class.forName(DRIVER);
       try{
       return con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
       }
       catch (SQLException e)
       {
         System.out.println(e.getMessage());
       }
       return null;
   }
   public static void main(String[] args) throws ClassNotFoundException
   {}
}
