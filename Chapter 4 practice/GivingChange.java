import java.util.Scanner;

public class GivingChange
{
    public static void main(String[] args)
    {
        Scanner money = new Scanner(System.in);
       
        int payDue, payRecieved;
        
        System.out.print("Amount due in pennies: ");
        payDue = money.nextInt();
       
        System.out.print("Amount Recieved from Customer in pennies: ");
        payRecieved = money.nextInt();
        
        int change = payRecieved - payDue;
        
        int dollars = change / 100;
        int remaining = change % 100;
        int quarters = remaining / 25;
        remaining = remaining % 25;
        int dimes = remaining / 10;
        remaining = remaining % 10;
        int nickles = remaining / 5;
        remaining = remaining % 5;
        int pennies = remaining; 
        
        System.out.println("Dollars: "+dollars);
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickles: "+nickles);
        System.out.println("Pennies: "+pennies);
        
    }
}