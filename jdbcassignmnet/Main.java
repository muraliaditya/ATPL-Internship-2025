import java.sql.*;
public class Main {
    public static void main(String[] args)throws Exception{
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://192.168.71.15:3306/intern";
        String usname="intern2025";
        String pswd="intern2025";

//        class .forName(driver);
        Connection cn=DriverManager.getConnection(url,usname,pswd);
        Statement s= cn.createStatement();
        s.executeUpdate("");
        cn.close();
    }
}