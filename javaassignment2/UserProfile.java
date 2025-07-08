class UserProfile {
    private String username;
    private String email;
    private String password;

    public void setusername(String username) {
        this.username = username;
        System.out.println(username);
    }

    public void setemail(String email) {
        this.email = email;
        System.out.println(email);
    }

    public void setpassword(String password) {
        // System.out.println("enter password with greater than 8 chars and less than 10");
        if (password.length() >=8 && password.length()<=10) {
            this.password = password;
            System.out.println(password);
        }
    }

    public static void main(String args[]){
        UserProfile up=new UserProfile();
        up.setusername("aditya");
        up.setemail("aim@gmail.com");
        up.setpassword("adityaaa");

    }
}
