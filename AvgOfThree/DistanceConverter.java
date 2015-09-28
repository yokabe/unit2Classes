public class DistanceConverter
{
   public static void main(String[] args)
   {
      static final int inchesInFeet = 12;
      double yards = 3.5;
      double feet = yards * 3;
      double inches = feet * inchesInFeet;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}