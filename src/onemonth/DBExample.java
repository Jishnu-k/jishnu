package onemonth;
import java.sql.*;

/**
 * Created by expert on 7/30/18.
 */
public class DBExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
        PreparedStatement ps=connection.prepareStatement("select * from student where id=?");
        ps.setInt(1,1);
        ResultSet rs=ps.executeQuery();
        if (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        connection.close();
    }
}

