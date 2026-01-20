class Base
{
  public void Basetext()
   {
     System.out.println("This is base class");
   }
}







class Derived1 extends Base
{
    public void Derived1text()
    {
     System.out.println("this is first Derived class");
    }
} 




class Derived2 extends Base
{
   public void Derived2text()
    {
     System.out.println("this is second Derived class");
    }
}


class Hierachical
{
  public static void main(String args[])
   {
     System.out.println("this is Hierachical in heritance ");
     Derived1 obj=new Derived1();
     obj.Derived1text();
     obj.Basetext();
     Derived2 obj1=new Derived2();
     obj1.Derived2text();
   }
}