import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserAcess {
    public static void main(String[] args) throws Exception{
        Connection cn= DriverManager.getConnection(
                "jdbc:mysql://192.168.71.15:3306/intern",
                "intern2025","intern2025");
        PreparedStatement ps=cn.prepareStatement("insert into user_muraliaditya (id,u_name) values(?,?)");{
            ps.setInt(1,15);
            ps.setString(2,"kumar");
            ps.executeUpdate();
            }
            ResultSet rs= ps.executeQuery("Select*from user_muraliaditya");

            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("u_name"));

            }

        cn.close();
    }
}
