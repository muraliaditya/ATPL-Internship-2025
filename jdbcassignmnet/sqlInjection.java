
import java.sql.*;
import java.io.*;
public class  sqlInjection{
    public static void main(String[] args)throws Exception{
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://192.168.71.15:3306/intern";
        String usname="intern2025";
        String pswd="intern2025";
        try {
            InputStreamReader i=new InputStreamReader(System.in);
            BufferedReader b=new BufferedReader(i);
            System.out.println("entre id");
            String id=b.readLine();
            System.out.println("enter name");
            String name=b.readLine();
//        class .forName(driver);
            Connection cn = DriverManager.getConnection(url, usname, pswd);
            Statement s = cn.createStatement();
            String qry = "select price from products_muraliaditya where id='"+id+"' and name='"+name+"'";
            System.out.println(qry);
            ResultSet rs=s.executeQuery(qry);
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