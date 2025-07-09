class SampleException extends Exception {   
    public SampleException(String message){
        super(message);
    }
    static String username;
    static String password;
    public static void login(String username,String password){
           
    }
    public static void main(String[] args) {
        login("aditya","word");
        try{
            if(username!="adity" && password!="word"){
            throw new SampleException("Login Failed Exception");
            }
        }
        catch(SampleException le){
            System.out.println(le.getMessage());
        }
    }
}
