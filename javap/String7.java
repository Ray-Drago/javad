

import java.util.*;
class Cstring
{
String s1,s2,s3;

public void read()
  {
    Scanner s=new Scanner(System.in);
    
    
      System.out.println("\nEnter a String 1 :");
      s1=s.nextLine();

      System.out.println("Enter a String 2 :");
      s2=s.nextLine();
    
      
}

	public void display()
{
	System.out.println("\nString 1 :"+s1);
	System.out.println("String 2 :"+s2);
}
public void concate()
{
	s3=s1+s2;
	System.out.println("Concatination :"+s3);
}
}
class String7
  {
   public static void main(String args[])throws Exception
   {
     Cstring sw=new Cstring();
	 sw.read();
	 sw.display();
	 sw.concate();
    }
  }
