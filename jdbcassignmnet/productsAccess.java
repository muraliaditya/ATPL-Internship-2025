import java.sql.*;
public class productsAccess {
    public static void main(String[] args)throws Exception {
        Connection cn=DriverManager.getConnection(
                "jdbc:mysql://192.168.71.15:3306/intern",
                "intern2025", "intern2025");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(
                "select * from products_muraliaditya");
        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("price"));
        }
        cn.close();
        System.out.println("Done");
    }
}
