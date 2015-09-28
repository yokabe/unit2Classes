public class Annuity
{
    public static void maths(String[] args)
    {
        double pmt = 10000;
        double n = 20;
        double i = 0.08;
        
        double pvAnn = pmt*(((Math.pow((1+i),(n-1))/i)/((Math.pow((1+i),(n-1)))))+1);
        System.out.println(pvAnn);
    }
}
