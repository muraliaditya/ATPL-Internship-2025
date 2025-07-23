
import java.sql.*;
import java.util.*;
public class  SqlInjection2{
    public static void main(String[] args)throws Exception{
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://192.168.71.15:3306/intern";
        String usname="intern2025";
        String pswd="intern2025";
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("entre id");
            int id= sc.nextInt();
            sc.nextLine();
            System.out.println("enter name");
            String name=sc.nextLine();
//        class .forName(driver);
            Connection cn = DriverManager.getConnection(url, usname, pswd);

            String qry = "select price from products_muraliaditya where id=? and name=?";
            PreparedStatement ps = cn.prepareStatement(qry);
            System.out.println(qry);
            ps.setInt(1,id);
            ps.setString(2,name);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getDouble(1));
            }
            else{
                System.out.println("invalid credentials");
            }
            cn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}