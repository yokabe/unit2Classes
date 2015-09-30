import java.util.Scanner();

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
        
        int change = payRecieved - payDue
    }
}