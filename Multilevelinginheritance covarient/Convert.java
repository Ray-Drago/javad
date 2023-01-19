//Multilevel inheritance interface supports 

/*import java.io.*;
interface A
{}
interface B
{}
class implements A,B
{
}

class MultIN
{
public static void main(String args[])
{

}
}
*/

//Covarient type
/*
import java.io.*;
class A
{
	void disp()
	{System.out.println("aaaa");}
}
class B extends A
{
	void disp()
	{System.out.println("bbbb");}
}
class Convert
{
public static void main(String args[])
{
A a=new A(); 
a.disp();
B b=new B();
b.disp();
}
}
*/

/*
import java.io.*;
class A
{
	A disp()
	{System.out.println("aaaa");
	return(this);
	}
}
class B extends A
{
	B disp()
	{System.out.println("bbbb");
	return(this);
	}
}


class Convert
{
public static void main(String args[])
{
A a=new A(); 
a=a.disp();
B b=new B();
b=b.disp();
}
}
*/
