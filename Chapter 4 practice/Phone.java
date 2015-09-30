import java.util.Scanner;

public class Phone
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        String phone;
        
        System.out.print("Enter a ten digit phone number (just numbers): ");
        phone = number.next();
        
        String area = phone.substring(0,3);
        area =  "(" + area + ") ";
        
        String first = phone.substring(3,6);
        String second = phone.substring(6);
        
        String phonenumber = first + "-" + second;
    
        
        System.out.println(area + phonenumber);
    }
}