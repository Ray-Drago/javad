// NoArgument Return type
class test
{
	
	public int sq()// access specifier retrn type methname(variables)
	{
	int a=10;
	int b =14;
		int p=a*b;
		return p;
		
	}
}
class Fundemob
{
public static void main(String args[])
{
	test t =new test();
	int x=t.sq();
    System.out.println("Product is "+x);
}
}