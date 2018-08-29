package onemonth;

import java.sql.*;

/**
 * Created by expert on 8/3/18.
 */
public class WBcompany {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
        Statement statement=connection.createStatement();

        ResultSet rs1=statement.executeQuery("select avg(salary) from Employee");
        while(rs1.next()){
            System.out.println(rs1.getInt(1));
        }

        ResultSet rs2=statement.executeQuery("SELECT * FROM company.Product order by name asc");
        while (rs2.next()){
            System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getInt(4));
        }

        ResultSet rs3=statement.executeQuery("select * from company.Employee where salary>150 and gender='m'");
        while (rs3.next()){
            System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getString(3)+" "+rs3.getInt(4));
        }

        CallableStatement cs=connection.prepareCall(""+"{call salEmployee(?)}");
        int y=cs.getInt(1);
        System.out.println("maxsalary is "+y);
    }
}
