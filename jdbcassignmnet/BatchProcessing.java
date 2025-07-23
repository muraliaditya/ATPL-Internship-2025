import java.sql.*;



public class BatchProcessing {
    public static void main(String[] args)throws Exception{
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://192.168.71.15:3306/intern";
        String usname="intern2025";
        String pswd="intern2025";

//        class .forName(driver);
        Connection cn=DriverManager.getConnection(url,usname,pswd);

        cn.setAutoCommit(false);
        PreparedStatement s= cn.prepareStatement("insert into user_muraliaditya (id,u_name) values(?,?)");
        s.setInt(1,106);
        s.setString(2,"adit");

        s.addBatch();

        s.setInt(2,107);
        s.setString(2,"adity");

        s.addBatch();

        s.setInt(1,108);
        s.setString(2,"aditya");

        s.addBatch();

        s.executeBatch();
        cn.commit();
        cn.close();
    }
}