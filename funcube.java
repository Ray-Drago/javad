// to find cube using nested function
class test
{
	
	public int sq(int a)// access specifier retrn type methname(variables)
	{
	
		int p=a*sq(a);
		return p;
		
	}
}
class Funcube
{
public static void main(String args[])
{
	test t =new test();
	int a=10;
	int b =14;
	int x=t.sq(a,b);
    System.out.println("Product is "+x);
}
}