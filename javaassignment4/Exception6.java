class LoginFailedException1 extends Exception {   
    public LoginFailedException1(String message){
        super(message);
    }
    public void login(String username,String password){
        System.out.println("username: "+username+"password:"+password);
    }
    
}

class Exception6{
    public static void main(String[] args) {
        try{
            if(username!="Aditya" && password!="1234"){
            throw new LoginFailedException1("Invalid Login Details");
            }
        }
        catch(LoginFailedException1 le){
            System.out.println(le.getMessage());
        }
    }
}
