
//classes-methods,variables
class test
{
int a,b;
public int sum(int x,int y)
{
	return(x+y);
	
}
}
class ObjDemo
{
public static void main(String args[])
{
test c=new test();
int a=3,b=4;
c.a=10;
c.b=20;
int s=c.sum(a,b);
int s1=c.sum(c.a,c.b);
System.out.println("a is "+a);
System.out.println("b is "+c.b);
System.out.println("sum is "+s);
System.out.println("sum1 is "+s1);
}
}