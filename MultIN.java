//Multilevel inheritance interface supports 
import java.io.*;
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
import java.io.*;
Class A
{
	void disp()
	{System.out.println("ddddd")}
}
interface B
{}
class implements A,B
{
}

class MultIN
{
public static void main(String args[])
{
A a=new A(); 
a.disp()
B b=new B();
b.disp()
}
}