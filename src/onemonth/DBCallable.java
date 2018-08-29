package onemonth;

import java.sql.*;

/**
 * Created by expert on 8/2/18.
 */
public class DBCallable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        CallableStatement cs=connection.prepareCall(""+"{call getEmployee(?,?,?)}");
        cs.setInt(1,100);
        cs.setString(2,"jishnu");
        cs.registerOutParameter(3,Types.INTEGER);
        cs.execute();
       // int x=cs.getInt(3);
        int y=cs.getInt("total");
        System.out.println(y);

        /*
        ResultSet rs=cs.getResultSet();
        while (rs.next()){
            System.out.println("Name is"+rs.getString("empname")+" "+"salary is"+rs.getInt("salary"));
        }

        connection.close();
        */
    }
}
