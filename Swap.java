/*
// Call by value Swapping of numbers
import java.io.*;
class Swap
{
	public static void swap(int a,int b)
	{
		System.out.println("Inside fn bfrswap A: "+a+" b :: "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("Inside fn afr swap A: "+a+" b :: "+b);
	}
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("Before swap A: "+a+" b :: "+b);
		
		swap(a,b);//Call by value
		
		System.out.println("After swap A: "+a+" b :: "+b);
	}
  }
  */
  // Call by value object oriented
  /*
 import java.io.*;

class Num{
public static void swap(int a,int b)
	{
		System.out.println("Inside fn bfrswap A: "+a+" b :: "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("Inside fn afr swap A: "+a+" b :: "+b);
	}
}
 class Swap
{
	
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("Before swap A: "+a+" b :: "+b);
		Num N=new Num();
		N.swap(a,b);//Call by value
		
		System.out.println("After swap A: "+a+" b :: "+b);
	}
  }
  */
  //CALL BY REFERENCE
  /*
  import java.io.*;
class Num
{
	int x;
}
class Test{
public static void swap(Num a,Num b)
	{
		System.out.println("Inside fn bfrswap A: "+a.x+" b :: "+b.x);
		int c=a.x;
		a.x=b.x;
		b.x=c;
		System.out.println("Inside fn afr swap A: "+a.x+" b :: "+b.x);
	}
}
 class Swap
{
	
	public static void main(String args[])
	{
		Num a=new Num();
	
		a.x=10;
		Num b=new Num();
		b.x=20;
		System.out.println("Before swap A: "+a.x+" b :: "+b.x);
		Test t=new Test();
		t.swap(a,b); //Call by reference //non primitive
		
		System.out.println("After swap A: "+a.x+" b :: "+b.x);
	}
  }
  */
  
  //Call by reference with object
  /*
   import java.io.*;
class Myclass
{
	int x;
}
class Num{
public static void swap(Myclass a,Myclass b)
	{
		System.out.println("Inside fn bfrswap A: "+a.x+" b :: "+b.x);
		int c=a.x;
		a.x=b.x;
		b.x=c;
		System.out.println("Inside fn afr swap A: "+a.x+" b :: "+b.x);
	}
}
 class Swap
{
	
	public static void main(String args[])
	{
		
		Myclass m1=new Myclass();
		m1.x=10;
		Myclass m2=new Myclass();
		m2.x=20;
		System.out.println("Before swap A: "+m1.x+" b :: "+m2.x);
		Num N=new Num();
		N.swap(m1,m2);//Call by reference
		
		System.out.println("After swap A: "+m1.x+" b :: "+m2.x);
	}
  }