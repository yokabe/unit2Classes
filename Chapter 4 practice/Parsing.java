import java.util.Scanner;

public class Parsing
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        String n;
        
        System.out.print("Insert a number between 1,000 and 999,999 with the commma: ");
        n = number.next();
        
        int index = n.indexOf(",");
        String one = n.substring(0,index);
        String two = n.substring((index+1));
        System.out.println(one+two);
    }
}