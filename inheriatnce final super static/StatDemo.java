
//Static block
/*
import java.io.*;
class StatDemo
{
	static
	{
		System.out.println("Main");

	}
public static void main(String args[])
{
System.out.println("Main running");
}
}
*/
//Static 1 of method
/*
import java.io.*;
class StatDemo
{
	static int x=10;
	static void test()
	{
		
		x++;
		System.out.println("x"+x);
	}
public static void main(String args[])
{

System.out.println("Main running");
test();
}
static
	{
		System.out.println("Main");

	}
}
*/
// Static second method
import java.io.*;
class Mynew
{
	 static int x=10;
	 
	static void fun()
	{
		
		System.out.println("x"+x);
	}
}
class StatDemo
{
public static void main(String args[])
{

System.out.println("Main running");
//Mynew m=new Mynew();
Mynew.fun();
}
}