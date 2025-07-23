import java.sql.*;
    public class updateDeatils {
        public static void main(String[] args)throws Exception{
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://192.168.71.15:3306/intern";
            String usname="intern2025";
            String pswd="intern2025";

//        class .forName(driver);
            Connection cn= DriverManager.getConnection(url,usname,pswd);
            PreparedStatement ps= cn.prepareStatement("update user_muraliaditya set age=12 where id=?");
            ps.setInt(1,102);
            ps.executeUpdate();
            cn.close();
        }
    }

