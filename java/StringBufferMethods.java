
 class StringBuffer
{
  public static void mai(String argsss[])
   {
     StringBuffer sb = new StringBuffer("Welcome");
     //1.append()
     sb.append("java");
     System.out.println("After append:"+sb);
     //2.insert(),
     sb.insert("to");
     System.out.println("After insert:"+sb);
     //3.setCharAt()s
     sb.setCharAt(4,'a');
     System.out.println("After setCharAt:"+sb);
     //4.delete()
     sb.delete(0,7);// delete acharacter from the index0 to 6
     System.out.println("After delete:"+sb);
     //5.replace()
     sb.replace(0,4,"Hello");
     System.out.println("After replace:"+sb);
     //6.revers()
     sb.revers();
     System.out.println("After revers:"+sb);
     System.out.println("length:"+sb.length());
   } 

}