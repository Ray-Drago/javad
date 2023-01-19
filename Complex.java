//To read and display complex number
import java.io.*;
import java.lang.*;
class Comp
{
	int r1,im;
	String str;
	void read()
	{
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter real part");
			str=din.readLine();
			r1=Integer.parseInt(str);
			System.out.println("Enter Imaginery part");
			str=din.readLine();
			im=Integer.parseInt(str);	
		}
		catch(Exception e) 
		{
			System.out.println(e);
			}	
	}
 
 void disp()
 {
	 System.out.println("the real part :"+r1);
	 System.out.println("The imaginery  part:"+im);
	 System.out.println("The number is:"+r1+ "+" +im+ "i");
 }
}
class Complex
{
public static void main(String args[])
{
	
	Comp c1=new Comp();
	System.out.println("First");
	c1.read();
	c1.disp();
	Comp c2=new Comp();
	System.out.println("Second");
	c2.read();
	c2.disp();
    
    
    	
}
}