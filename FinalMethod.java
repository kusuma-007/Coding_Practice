class Base
 {
   public void Basetext()
    {
     System.out.println("this is Base");
    }
 }


class  Derived extends Base
{
  final public void Derivedtext()
    {
      System.out.println("this is Derived");
    }
}


 class FinalMethod
 {
  public static void main (String args[])
   {
      System.out.println("this is a FinalMethod");
      Derived obj = new Derived();
      obj.Derivedtext();
   }

}