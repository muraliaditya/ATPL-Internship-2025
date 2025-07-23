import java.sql.*;
    public class PartialMatch {
        public static void main(String[] args)throws Exception{
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://192.168.71.15:3306/intern";
            String usname="intern2025";
            String pswd="intern2025";

//        class .forName(driver);
            Connection cn= DriverManager.getConnection(url,usname,pswd);
            PreparedStatement ps= cn.prepareStatement("select * from user_muraliaditya where email like ?");
            ps.setString(1,"%@g.com");
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("u_name"));
            }
            cn.close();
        }
    }

