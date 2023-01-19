// Single Inheriatnce

/*import java.io.*;
class Animal
{
public Animal()
{
System.out.println("Aniaml cons");
}
public void eat()
{
	System.out.println("Aniaml EATS");
	}
}
class Cat extends Animal
{
public Cat(){System.out.println("Cat cons");}
public void eat() {System.out.println("Cat EATS");}

}

class SinIn
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/


// 1.super instance
/*
import java.io.*;
class Animal
{
String col="White";
public void eat(){System.out.println("Aniaml EATS");
System.out.println("Colour:"+coll);
}

}
class Cat extends Animal
{
String col="Black";

public void eat() 
{
	System.out.println("Cat EATS");
	System.out.println("Colour:"+col);
	System.out.println("Colour"+super.coll);}

}

class SinIn
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/

//3 Super constructor
/*
import java.io.*;
class Animal
{
public Animal(){System.out.println("Aniaml cons");}
public void eat(){System.out.println("Aniaml EATS");}

}
class Cat extends Animal
{
public Cat()
   {
	 super();
	 System.out.println("Cat cons");
   }
public void eat()
 { 
 System.out.println("Cat EATS");}
}



class SinIn
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/


// USING INHERITANCE TO FIND THE VOLUME OF CUBOID 
/*
import java.io.*;
class Rectangle//12,13
{
	int l,b;
public Rectangle(int x,int y)
    {
	l=x;
	b=y;
	}
	int vol()
	{
		return(l*b);
	}
}
class Cuboid extends Rectangle
{
	int h;
    public Cuboid(int x,int y,int z)
{
    super(x,y);
	h=z;	
}
int vol()
  {
	return(l*b*h);
  }
}

class SinIn
{
public static void main(String args[])
{
Cuboid c1=new Cuboid(12,23,34);
int v=c1.vol();
System.out.println("volume is "+v);
}
}
*/
import java.io.*;
class Test
{
public Test()
{
System.out.println("Test Cons-no arg");
}
public Test(int a)
{
System.out.println("Test 1 arg");
}
public Test(int a,int b,int c)
{
System.out.println("Test 3 arg");
}
 {
 System.out.println("My IIB");
 }
 }
 class SinIn
 {
 public static void main(String args[])
 {
 Test t1=new Test();
 Test t2=new Test(10);
 Test t3=new Test();
 Test t4=new Test(10,20,30);
 }
 }
