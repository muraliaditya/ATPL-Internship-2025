import java.sql.*;
public class DynamicRangeQuery {
    public static void main(String[] args)throws Exception{
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://192.168.71.15:3306/intern";
        String usname="intern2025";
        String pswd="intern2025";

//        class .forName(driver);
        Connection con= DriverManager.getConnection(url,usname,pswd);
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM products_muraliaditya WHERE price BETWEEN ? AND ?");
        pstmt.setDouble(1, 35.00);

        pstmt.setDouble(2, 50.00);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));

        }
        con.close();
    }
}