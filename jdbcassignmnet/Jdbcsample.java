import java.sql.*;
public class Jdbcsample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://192.168.71.15:3306/intern",
                        "intern2025", "intern2025");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from Student_muraliaditya");
                while (rs.next()) {
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString("std_name"));
                }
                con.close();
                System.out.println("Steps in Setting Up of JDBC");
            }
        }
