class test
{
	
	public  void sq(int x,int y)// access specifier retrn type methname(variables)
	{
		int p=x*y;
		System.out.println("Product is "+p);
	}
}
class Fundemo
{
public static void main(String args[])
{
	test t =new test();
	int a=10;
	int b =14;
     t.sq(a,b);
}
}