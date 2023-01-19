// Argument  & Return type
class test
{
	
	public int sq(int a,int b)// access specifier retrn type methname(variables)
	{
	
		int p=a*b;
		return p;
		
	}
}
class Fundemoc
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