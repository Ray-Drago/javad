import java.io.*;
class Javap83
{
public static void main(String args[])
{
try
{
	String s="reg";
    int i=Integer.parseInt(s);
     System.out.println(i);
     i++;
     System.out.println(i);
	      System.out.println(s);
}
catch(NumberFormatException e)
{
   e.printStackTrace();
   //System.out.println(e)
}
finally
{
	System.out.println("Final Comment...");
}

}
}