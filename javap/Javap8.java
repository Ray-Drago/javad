//Read numbers into an array.
// Perform validations using multiple catch statements / predefined Exceptions.

import java.io.*;
import java.util.*;
class Javap8
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter the number of Elements  :");
int n=sc.nextInt();
System.out.println("Enter the elements :");
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	
}
System.out.println("Entered  the numbers are :");
for(i=0;i<n;i++)
{
	System.out.println(" "+a[i]);
}
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
catch(Exception e)
{
System.out.print(e);
}
}
}
