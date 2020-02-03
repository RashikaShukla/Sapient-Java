import java.util.*;
public class Client{
    public static void main(String[] args) {
        
        BankAc acc =new BankAc();

        System.out.print("Welcome to Sapient bank!\nPress 1 to Deposit\nPress 2 to withdraw\nPress 3 to check balance\nPress 4 to exit\n");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.print("Enter amount to be deposited");
            acc.deposit(sc.nextDouble());
            break;
        
            case 2:
            System.out.print("Enter amount to be withdrawn");
            acc.withdraw(sc.nextDouble());
            break;
            
            case 3:
            System.out.println("Your balance is " +acc.checkBalance());
            break;

            case 4:
            System.out.println("Thank You for using Sapient Bank!");
            break;

            default:
            System.out.print("Wrong choice");
        }

        
     }

}