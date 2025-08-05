<%@ page import="java.sql.*, com.aaslin.util.*" %>
<%
    Connection con = DBConnection.getConnection();
    PreparedStatement ps = con.prepareStatement("SELECT * FROM complaints_ma");
    ResultSet rs = ps.executeQuery();
%>
<table border="1">
<tr><th>ID</th><th>User</th><th>Description</th><th>Status</th><th>Updated</th></tr>
<% while(rs.next()) { %>
<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getInt("user_id")%></td>
<td><%=rs.getString("description")%></td>
<td><%=rs.getString("status")%></td>
<td><%=rs.getTimestamp("updated_date")%></td>
</tr>
<% } %>
</table>
