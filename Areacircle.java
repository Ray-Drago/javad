import java.io.*;
import java.lang.*;
class Areacircle
{
public static void main(String srgs[])
{
	String str;
	int r;
	DataInputStream din;
	din=new DataInputStream(System.in);
	try
	{
	System.out.println("Enter radius r:");
	str=din.readLine();
	r=Integer.parseInt(str);
	 double area=3.14*r*r;
	 System.out.println("Radius :"+r);
	 System.out.println("Area :"+area);
	}
	catch(Exception e)
	{
	System.out.println("Error"+e);
	}
}
}