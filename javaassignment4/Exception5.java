class LoginFailedException extends Exception {   
    public LoginFailedException(String message){
        super(message);
    }
    
}

class Exception5{
    public static void main(String[] args) {
        try{
            throw new LoginFailedException("Invalid Login Details");
        }
        catch(LoginFailedException le){
            System.out.println(le.getMessage());
        }
    }
}
