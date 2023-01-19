// Generate student marklist by using by call by reference
/*
import java.io.*;

class Call
{
public static void main(String args[])

{
	int mark;
	
    DataInputStream d=new DataInputStream(System.in);
	try
	{
		mark=Integer.parseInt(d.readLine());
		System.out.println("Enter yor mark:"+mark);
     if(mark>=50)
	 {
		 System.out.println("Passed");
	 }
	 else 
	 {
		 System.out.println(" Failed");
	 }
	}
     catch(IOException e)
	 {
		 System.out.println(e);
	 }
}
}
*/
import java.io.*;

class Call
{
public static void main(String args[])
{
	int m1,m2,m3,total;	
	double Percentage;
	DataInputStream d=new DataInputStream(System.in);
	try
	{
		m1=Integer.parseInt(d.readLine());
		System.out.println("Enter yor Maths mark:"+m1);
		m2=Integer.parseInt(d.readLine());
		System.out.println("Enter yor Physics mark:"+m2);
		m3=Integer.parseInt(d.readLine());
		System.out.println("Enter yor Chemistry mark:"+m3);
		total=m1+m2+m3;
		System.out.println("Total marks : "+total);
		Percentage=(m1+m2+m3/180)*100;
		System.out.println(" Percentage : "+Percentage +"%");
		
	}
	catch(IOException e)
	 {
		 System.out.println(e);
	 }
}
}

