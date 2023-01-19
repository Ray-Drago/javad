
//Normal pgm 
/*
import java.io.*;
class Test
{
	int a,b;
	{
		
	}
}
class Clone
{
public static void main(String args[])
 {
	 Test t=new Test();
	 t.a=10;
	 t.b=20;
	 System.out.println("t.a :"+t.a+" t.b : "+t.b);
 
 }
 }
 */
  //Cloning in java
  import java.io.*;
class Test implements Cloneable
{
	int a,b;
	
	public Object clone()
	{
		try
	{
		return super.clone();
	}
	
	catch (CloneNotSupportedException e)
	{
		System.out.println(e);
		return this;
	}
	}
}
class Clone
{
public static void main(String args[])
 {
	 Test t=new Test();
	 t.a=10;
	 t.b=20;
	 System.out.println("t.a :"+t.a+" t.b : "+t.b);
 
     Test t1=(Test)t.clone();//(Typecasting)//Creation of clone of t of type test
	 System.out.println("t1.a :"+t1.a+" t.b : "+t1.b);
 }
 }