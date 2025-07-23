import java.sql.*;
public class ReusingPreparedstatement {
    public static void main(String[] args)throws Exception {
        String driver="com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String user = "intern2025";
        String password = "intern2025";
        String qry = "INSERT INTO user_muraliaditya (id, u_name, age, email) VALUES (?, ?, ?, ?)";
        int[] ids = {101, 102, 103, 104};
        String[] names = {"adi", "dinu", "gowtham", "pramodh"};
        int[] ages = {11, 11, 12, 11};
        String[] emails = {"adi@g.com", "dinu@g.com", "go@g.com", "pr@g.com"};
       Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(qry);
            for (int i = 0; i < ids.length; i++) {
                ps.setInt(1, ids[i]);
                ps.setString(2, names[i]);
                ps.setInt(3, ages[i]);
                ps.setString(4, emails[i]);
                ps.executeUpdate();  // Executes with new parameters each time
            }

            System.out.println("Inserted all users using loop.");

    }
}

