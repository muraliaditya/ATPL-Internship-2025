public class Bankaccount {
    public static void main(String args[]){
        String accountholder;
        int accno;
        float balance;
        float depositamt;
        float withdrawamt;

        Bankaccount b=new Bankaccount();
        b.balanceenquiry("aditya",11233, 1000);
        Bankaccount a=new Bankaccount();
        a.deposit("ram",11234,1000,500);
        Bankaccount d=new Bankaccount();
        d.withdraw("joy",11232,2000,1500);
    }
        public void deposit(String accountholder,int accno,float balance,float depositamt){
            System.out.println("balance after depositing: "+(balance+depositamt));
        }
        public void withdraw(String accountholder,int accno,float balance,float withdrawamt){
            System.out.println("balance after withdraw: "+(balance-withdrawamt));
        }
        public void balanceenquiry(String accountholder,int accno,float balance){
            System.out.println("balance available: "+(balance));
        }

}
