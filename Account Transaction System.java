public class account
{
    String account_number;
    long balance;

    public account(String account_number, long balance)
    {
        this.account_number=account_number;
        this.balance=balance;
    }

    protected  void deposite(int amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("$"+amount+" Deposited Successfully");
            System.out.println("Current balance: "+balance);
        }
        else
        {
            System.out.println("Invalid Amount !!");
        }
    }

    public void withdraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
            System.out.println("$"+amount+" Withdrawed Successfully");
            System.out.println("current balance: "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance !!");
        }
    }

    public void displaydetails()
    {
        System.out.println("Account number: "+account_number);
        System.out.println("Balance: "+balance);
    }
    
    public static void main(String[] args)
        {
            account account1=new account("123456789",1000);
            account account2=new account("987654321",5000);
            System.out.println("==== user1 ====");
            account1.displaydetails();
            account1.deposite(15000);
            account1.withdraw(6000);
            System.out.println("==== user2 ====");
            account2.displaydetails();
        }
}
