//program 13
import java.io.*;
abstract class Accounts
{
    double balance;
    long accountNumber;
    String accountHoldersName = new String();
    String address = new String();

    Accounts(long ac, String name, double bal, String add)
    {
        accountNumber = ac;
        balance = bal;
        accountHoldersName = name;
        address = add;
    }

    abstract void withrawl(double d);
    abstract void deposit(double d);

    void display()
    {
        System.out.println("Availiable Balance: " + balance);
    }
}

class SavingsAccount extends Accounts
{
    SavingsAccount(long ac, String name, double bal, String add)
    {
        super(ac, name, bal, add);
    }

    final double rateOfInterest = 3.5;//in percentage

    void calculateAount()
    {
        super.balance += rateOfInterest/100*super.balance;
    }

    void withrawl(double amt)
    {
        super.balance -= amt;
    }

    void deposit(double amt)
    {
        super.balance += amt;
    }
}

class P13
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = new String();
        long acn;
        double b, a;
        String add = new String();
        int ch;
        System.out.print("Enter Account Number: ");
        acn = Long.parseLong(br.readLine());
        System.out.print("Enter Name: ");
        n = br.readLine();
        System.out.print("Enter Address: ");
        add = br.readLine();
        System.out.print("Enter Initial Amount: ");
        b = Double.parseDouble(br.readLine());
        SavingsAccount ob = new SavingsAccount(acn, n, b, add);
        while(true)
        {
            System.out.print("1. Deposit   2. Withraw   3. Display Balance   0. Exit\nEnter choice: ");
            ch = Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                System.out.print("Enter amount: ");
                a = Double.parseDouble(br.readLine());
                ob.deposit(a);
                break;

                case 2:
                System.out.print("Enter amount: ");
                a = Double.parseDouble(br.readLine());
                ob.withrawl(a);
                break;

                case 3:
                ob.calculateAount();
                ob.display();

                case 0:
                System.out.print("Thank You");
                System.exit(0);

                default:
                System.out.println("Wrong Input. Try Again.");
            }
        }      
    }
}