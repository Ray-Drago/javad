import java.io.*;
import java.lang.*;
class ArraydemoScanner
{
public static void main(String srgs[])
{
	
	int a[]; //declared array
	int n,i;
	

	Scanner sc=new Scanner(System.in);
	try
	{
	System.out.println("Enterthe size of array:");
	 n=Integer.parseInt(sc.readLine());
	 a=new int[n];//creation of arrayof size n
	 System.out.println("Enter elements into array:");
	 {
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(sc.readLine());
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