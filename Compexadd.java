//To add complex numbers 

import java.io.*;
import java.lang.*;
class Comp
{
	int r1,im,c;
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
 void add(Comp c2)
  {
	  Comp c=new Comp();
	  c.r1=this.r1+c2.r1;
	  c.im=this.im+c2.im;
	  
  }
 void disp()
 {
	 System.out.println("the real part :"+r1);
	 System.out.println("The imaginery  part:"+im);
	 System.out.println("The number is:"+r1+ "+" +im+ "i");
 }
}
class Compexadd
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
	Comp c3=new Comp();
	c3=c1.add(c2);
	System.out.println("The sum is:"+c3.r1+ "+" +c3.im+ "i");   	
}
}

/*To find sum of two complex number (With return)

import java.io.*;
import java.lang.*;
class Comp
{
	int r1,im,c;
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
 Comp add(Comp c2)
  {
	  Comp c=new Comp();
	  c.r1=this.r1+c2.r1;
	  c.im=this.im+c2.im;
	  return(c);
  }
 void disp()
 {
	 System.out.println("the real part :"+r1);
	 System.out.println("The imaginery  part:"+im);
	 System.out.println("The number is:"+r1+ "+" +im+ "i");
 }
}
class Compexadd
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
	Comp c3=new Comp();
	c3=c1.add(c2);
	System.out.println("The sum is:"+c3.r1+ "+" +c3.im+ "i");   	
}
}
*/
