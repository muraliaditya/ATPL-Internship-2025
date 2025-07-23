import java.sql.*;
public class updateStatement {
    public static void main(String[] args)throws Exception {
        Connection cn=DriverManager.getConnection(
                "jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        Statement s=cn.createStatement();
        s.executeUpdate("update user_muraliaditya set email='ad@g.com' where id=101");
        cn.close();


    }
}
