/*
import java.io.*;
class Parent
{

	void test()//abstract 
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	
void test()//test is a method ,it is a concrete method
  {
	System.out.println("Child");
  }
}

class Cast
{
public static void main(String args[])
{
Parent p=new Parent();//Reference type-Object type//static type
p.test();
Child c=new Child();//static
c.test();
Parent p2=new Child();//dynamic //Upcasting
p2.test();
/*Child c2=new Parent();//Downcasting
c2.test();*/  // parent cannot be converted to child .
//This should not happen ,reverse not work
// TO DO DOWNCASTING//only upcasted will be able to downcasting
/*Child c2=(Child)p2;
c2.test();
}
}
*/

//Abstract class
/*
import java.io.*;
abstract class Parent
{
	void abstract test()//abstract 
	void test1()//concrete
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{	
void test()//test is a method ,it is a concrete method
  {
	System.out.println("Child");
  }
}

class Cast
{
public static void main(String args[])
{
Parent p=new Parent();//Reference type-Object type//static type
p.test();
Child c=new Child();//static
c.test();
Parent p2=new Child();//dynamic //Upcasting
p2.test();
/*Child c2=new Parent();//Downcasting
c2.test();*/  // parent cannot be converted to child .
//This should not happen ,reverse not work

// TO DO DOWNCASTING//only upcasted will be able to downcasting
/*Child c2=(Child)p2;
c2.test();
}
}
*/

//TO FIND AREA OD RECTANGLE AND TRIANGLE USING ABSTRACTION CLASS
/*import java.io.*;
abstract class Shape
{
	int l,b;
	Shape(int x,int y)
	{
		l=x;
		b=y;
	}
		abstract double area();//abs
		
}
class Rectangle extends Shape
{
 Rectangle(int x,int y)
	{
		super(x,y);
	}
		double area()
		{
			return(l*b);
        }
		void display()
		{
			System.out.println("Rectangle dispaly");
		}
}
class Triangle extends Shape
{
	Triangle(int x,int y)
	{
	super(x,y);
	}
		double area()
		{
			return(05*l*b);
		}
		void display()
       {
		   System.out.println("Triangle dispaly");
	   }
}

class Cast
{
public static void main(String args[])
{
 Rectangle R=new Rectangle(10,20);
 R.display();
 Shape s=new Shape();
Triangle T=new Triangle(10,15);
T.display();
double ra=R.area();
double ta=T.area();

System.out.println("Rectangle:"+ra);
System.out.println("Triangle:"+ta);
}
}
*/

//

import java.io.*;
interface Shape
{
	public double area();
		public void display();
	
}
class Rectangle implements Shape
{
    double l,b;
	Rectangle(double x,double y)
	{
		l=x;
		b=y;
	}
	
		
		public double area()
		{
			return(l*b);
        }
		public void display()
		{System.out.println("Rectangle dispaly");
		}
		
}
class Triangle implements Shape
{
	double l,b;
	Triangle(double x,double y)
	  {
		l=x;
		b=y;
	   }
		public double area()
		{
			return(05*l*b);
		}
		public void display()
       {
		   System.out.println("Triangle dispaly");
		}

}

class Cast
{
public static void main(String args[])
{
 Rectangle R=new Rectangle(10,20);
 R.display();
 Triangle T=new Triangle(10,15);
 T.display();
 
double ra=R.area();
System.out.println("Rectangle:"+ra);
double ta=T.area();
System.out.println("Triangle:"+ta);
}
}

