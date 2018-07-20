package Thursday;

import java.sql.*;

public class databaseConnect {

        static Connection Con=null;
        static Statement St=null;
        public static void buildConnection(){
            try {
                 Con = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "");
                 St = Con.createStatement();
            }
            catch (SQLException e){
                System.out.println(e.toString());
            }
        }
}
