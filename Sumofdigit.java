import java.io.*;
class test
{
public int sumof(int x)
	{
	int 
		while(n!=0)
		{
		digit=n%10;
		sum=sum+digit;
		n=n/10;
		}
		
	}
}
class Sumofdigit
{
public static void main(String args[])
{
	int n,digit,sum=0,s;
    DataInputStream din;
     din=new DataInputStream(System.in);
try
{
	System.out.println("Enter the no of element:");
	n=Integer.parseInt(din.readLine());
	test t =new test();
	s=t.sumof(n);
    System.out.println("Sum of digit is "+s);
}
catch(Exception e) {
	System.out.println(e);
}
}
}