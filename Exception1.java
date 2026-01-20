class Exception1
{
 public static void main (String args[])
 {
   try 
   {
     int a,b,c;
     a = 10;
     b = 5;
     c = a/(b-a);
    System.out.print(c);
    try
      {
     int l[]={2,3,4};
System.out.println(l[9]);

      }
      catch(ArrayIndexOutOfBoundsException r)
      {
System.out.println("it is Array");

      }
   }
catch(ArithmeticException e)
{
System.out.println("it is ArithmeticException");
}
}
}