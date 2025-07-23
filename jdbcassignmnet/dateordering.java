import java.sql.*;
public class dateordering {
    public static void main(String[] args)throws Exception{
                String driver="com.mysql.jdbc.Driver";
                String url="jdbc:mysql://192.168.71.15:3306/intern";
                String usname="intern2025";
                String pswd="intern2025";
                Connection cn=DriverManager.getConnection(url,usname,pswd);
                Statement s= cn.createStatement();
                s.executeUpdate("delete from user_muraliaditya  where dob>='2004-09-11'");
                cn.close();

    }
}
