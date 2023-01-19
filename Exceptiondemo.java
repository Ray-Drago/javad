/*import java.io.*;
class Exceptiondemo
{
public static void main(String args[]) throws IOException
{
try // try block
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String");
String s=br.readLine();
System.out.println(" String is "+s);
}
catch(IOException e)//catch block
System.out.println(e);//printstack|Trace

}
*/

/*
//Demonstrate Arithmetic Exception
import java.io.*;
class Exceptiondemo
{
public static void main(String args[]) throws IOException
{
	try
{
int a=50/0;
System.out.println("i is "+i);
}

catch(ArithmeticException e)
{
	System.out.println(e);
}
}
}
//NullPointerException

*/

/*
//Demonstrate NullPointerException Exception
import java.io.*;
class Exceptiondemo
{
public static void main(String args[])
{
	try
{
String s="kkkkkk";
System.out.println(s.length());
}
catch(NullPointerException e)
{
	System.out.println(e);
}
}
}
*/
/*
//Demonstrate NuberFormatException Exception
import java.io.*;
class Exceptiondemo
{
public static void main(String args[])
{
try
{
String s="reg";
int i=Integer.parseInt(s);
System.out.println(i);
i++;
System.out.println(i);
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
}
}

//Output: java.lang.NumberFormatException: For input string: "reg"
*/
/*
//Demonstrate ArrayIndexOutOfBoundsException
import java.io.*;
class Exceptiondemo
{
public static void main(String args[])
{
try
{

int a[]={10,20,30};
System.out.println(a[5]);

}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
}
}

//OUtput:   java.lang.ArrayIndexOutOfBoundsException: 5
*/

/*
//Demonstrate ArrayIndexOutOfBoundsException
import java.io.*;
class Exceptiondemo
{
public static void main(String args[])
{
try
{
   int a[]={10,20,30};
   System.out.println(a[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
   e.printStackTrace();
   //System.out.println(e)
}
}
}

/*
//Output :
E:\javad>java Exceptiondemo
java.lang.ArrayIndexOutOfBoundsException: 5
        at Exceptiondemo.main(Exceptiondemo.java:118)
*/

/*
//FINALLY KEYWORD

import java.io.*;
class Exceptiondemo
{
public static void main(String args[])
{
try
{
	String s="reg";
    int i=Integer.parseInt(s);
     System.out.println(i);
     i++;
     System.out.println(i);
	      System.out.println(s);
}
catch(NumberFormatException e)
{
   e.printStackTrace();
   //System.out.println(e)
}
finally
{
	System.out.println("Final Comment...");
}

}
}
*/

/*
//MULTIPLE CATCH BLOCK
import java.io.*;
class Exceptiondemo
{
public static void main(String args[])
{
try
{
	String s="789";
    int j=Integer.parseInt(s);
	System.out.println(j);
	try{
   int a[]={10,20,30};
   System.out.println(a[1]);
   try{
	   int a=50/0;
System.out.println(i);
   }
}

catch(ArithmeticException e)
{
   e.printStackTrace();
   System.out.println("INNermost")
}

catch(ArrayIndexOutOfBoundsException e)
{
   e.printStackTrace();
   System.out.println("hhhh");
}
catch(NumberFormatException e)
{
   e.printStackTrace();
   System.out.println(lll);
}
}
}
*/

/*
//PROGRAM Creat your own exception :you CANNOT ENTER NUMBER 100
import java.io.*;
class Exceptiondemo
{
	static void checknum(int n)
	{
		if(n==100)
		{
			throw new ArithmeticException("You should not enter 100");
		}
		else
		{
			System.out.println("Number entered is fine");
		}
	}
public static void main(String args[])
{
	try{
		
	checknum(100);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
*/

//PROGRAM Creat your own exception :with your name
import java.io.*;
class Exceptiondemo
{
	
public static void main(String args[])
{
	
		int i=100;
		try
		{
		if (i==100)
		{
			throw new AlanException("100 not allowed");}
		}
		// to  create your own exception use throw new
		catch(AlanException e)
		{
			System.out.println(e);
		}
}
}
class AlanException extends Exception
{
	AlanException(String mess)
	{
		super(mess);
	}
}
 
