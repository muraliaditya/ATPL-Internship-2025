<form action="update" method="post">
    Complaint ID: <input type="number" name="id"><br>
    New Status:
    <select name="status">
        <option value="OPEN">Open</option>
        <option value="IN_PROGRESS">In Progress</option>
        <option value="RESOLVED">Resolved</option>
    </select><br>
    <input type="submit" value="Update Status">
</form>
