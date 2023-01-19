// to find factorial using recursive
class test
{
	
	public int fact(int x)
	{
	
		{
		if(x>=1)
	    return(x*fact(x-1));
		else 
		return 1;
		}
		
	}
}
class Funfact
{
public static void main(String args[])
{
	test t =new test();
	int a=5;
	
	int f=t.fact(a);
    System.out.println("Factorial is "+f);
}
}