import java.io.*;
import java.lang.*;
class Arraydemo
{
public static void main(String srgs[])
{
	
	int a[]; //declared array
	int n,i;
	String str;
	DataInputStream din;
	din=new DataInputStream(System.in);
	try
	{
	System.out.println("Enterthe size of array:");
	str=din.readLine();
	n=Integer.parseInt(str); //n=Integer.parseInt(din.readLine());
	 a=new int[n];//creation of arrayof size n
	 System.out.println("Enter elements into array:");
	 {
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(din.readLine());
		}			
	 }
	 System.out.println("The array elments are :");
	 {
		 for(i=0;i<n;i++)
		{
			 System.out.println(a[i]);
		}	
	 }
	}
	catch(Exception e)
	{
	System.out.println("Error"+e);
	}
}
}