import java.io.*;
import java.lang.*;
class Arraysumfloat
{
public static void main(String args[])
{
float a[];
int n,i;
double sum=0.0;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the size of array :");
n=Integer.parseInt(din.readLine());
a=new float[n];
System.out.println("Enter the elenments of array :");
{
		for(i=0;i<n;i++)
		{
			a[i]=Float.parseFloat(din.readLine());
			sum=sum+a[i];
		}			
	 }
	 System.out.println("The array elments are :");
	 {
		 for(i=0;i<n;i++)
		{
			 System.out.println(a[i]);
		}	
		System.out.println("Sum ="+sum);
	 }
	}
	catch(Exception e)
	{
	System.out.println("Error"+e);
	}
}
}