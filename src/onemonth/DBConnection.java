package onemonth;

import java.sql.*;

/**
 * Created by expert on 7/30/18.
 */
public class DBConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
        Statement statement=connection.createStatement();
        statement.executeUpdate("insert into student values(1,'athira')");
        PreparedStatement ps=connection.prepareStatement("insert into"+"student values(?,?)");
        ps.setInt(1,12);
        ps.setString(2,"anu");
        ps.executeUpdate();
        ResultSet rs=statement.executeQuery("select * from student");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        connection.close();
    }
}
