public class BankAc{
    static double amount=0;
    public void deposit(double money){
        amount=amount+money;
    }
    public void withdraw(double money){
        if(amount>money)
        amount=amount-money;
        else
        System.out.print("Insufficient Balance");
    }
    public double checkBalance(){
        return amount;
    } 
}