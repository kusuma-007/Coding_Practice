import java.util.*;
import java.lang.*;
class Base
{
  public void BaseText()
  {
     System.out.println("this is the Base class");

  }
}

class Derived extends Base
{
  public void DerivedText()
  {
     System.out.println("this is the Derived  class");

  }
}
  
class sub extends Derived
{
  public void subText()
  {
     System.out.println("this is the sub  class");

  }
}

class Multilevel
{
  public static void main (String args[])  
  {
    System.out.println("this is a single inheritance");
    sub obj=new sub();
    obj.DerivedText();
    obj.BaseText();
    obj.subText();
  }
}
