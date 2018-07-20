package Wednesday;

import java.sql.*;

public class databaseConnect {
    public static void main(String[] args) {
        buildConnection();
    }

        public static void buildConnection(){
            try {
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "");
                Statement s = c.createStatement();
                s.executeUpdate("insert INTO students VALUES (5, 'Tony', '19 Mather Road', 'M30 0WQ')");
                ResultSet r = s.executeQuery("SELECT * FROM students;");
                while (r.next()){
                    System.out.println("RegNo: " +r.getInt("RegNo"));
                    System.out.println("Name: " +r.getString("Name"));
                }

            }
            catch (SQLException e){
            }
        }
    }
