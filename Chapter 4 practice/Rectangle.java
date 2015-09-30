import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner length = new Scanner(System.in);
        Scanner width = new Scanner(System.in);
        
        double l, w;
        
        System.out.print("Enter the length of the rectangle: ");
        l = length.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        w = width.nextDouble();
        
        double area = l*w;
        double perim = (2*l) + (2*w);
        double diag = Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));
        
        System.out.println("Area of rectangel: "+area);
        System.out.println("Perimeter of rectangle: "+perim);
        System.out.println("Length of Diagonal: "+diag);
        
        
    }
    
}