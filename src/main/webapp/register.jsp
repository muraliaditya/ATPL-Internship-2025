<form action="register" method="post">
    User ID: <input type="number" name="userId" required><br>
    Description: <textarea name="description" required></textarea><br>
    Category: <input type="text" name="category" required><br>
    Priority: <select name="priority">
        <option>Low</option>
        <option>Medium</option>
        <option>High</option>
    </select><br>
    <input type="submit" value="Register Complaint">
</form>
