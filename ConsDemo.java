// Constructors
import java.*;
import java.lang.*;
class demo
{
	int x;
	String y;
demo()
{
	System.out.println("CONS called");
}
demo(int a,String b)
{
	x=a;y=b;
	System.out.println(a);
	System.out.println(b);
}
void inc()
{
	x=x+1;
System.out.println(x);
}
}
class ConsDemo
{
public static void main(String args[])
{
demo d1=new demo();
demo d2=new demo(10,"Rajagiri");
d2.inc();
}
}



/*
import java.*;
import java.lang.*;
class demo
{
demo()
{
	System.out.println("CONS called");
}
demo(int a,String b)
{
	System.out.println(a);
	System.out.println(b);
}
}
class ConsDemo
{
public static void main(String args[])
{
demo d1=new demo();
demo d2=new demo(10,"Rajagiri");
}
}
*/