import java.sql.*;
public class NullHandling {
    public static void main(String[] args)throws Exception{
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://192.168.71.15:3306/intern";
        String usname="intern2025";
        String pswd="intern2025";
        Connection con= DriverManager.getConnection(url,usname,pswd);
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO user_muraliaditya(age,email) VALUES (?, ?)");
        pstmt.setInt(1,13);
        pstmt.setNull(2, java.sql.Types.VARCHAR);
        pstmt.executeUpdate();
        con.close();
    }
}
