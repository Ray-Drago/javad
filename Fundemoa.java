// NoArgument no Return type
class test
{
	
	public  void sq()// access specifier retrn type methname(variables)
	{
	int a=10;
	int b =14;
		int p=a*b;
		System.out.println("Product is "+p);
	}
}
class Fundemoa
{
public static void main(String args[])
{
	test t =new test();
	
     t.sq();
}
}