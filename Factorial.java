import java.io.*;
class test
{
public int fact(int x)
	{
	
		{
		if(x>=1)
	    return(x*fact(x-1));
		else 
		return 1;
		}
		
	}
}
class Factorial
{
public static void main(String args[])
{
	int n,f;
    DataInputStream din;
     din=new DataInputStream(System.in);
try
{
	System.out.println("Enter the no of element:");
	n=Integer.parseInt(din.readLine());
	test t =new test();
	f=t.fact(n);
    System.out.println("Factorial is "+f);
}
catch(Exception e) {
	System.out.println(e);
}
}
}