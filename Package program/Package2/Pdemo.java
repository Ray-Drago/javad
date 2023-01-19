/*
package Package2;       //Im inside =package 2 
public class Pdemo
{

public static void disp(int n)
 {
	System.out.println("Inside package"+n);
 }
}

*/
package Package2;       //Im inside =package 2 

public class Pdemo
{
static int n=100;
public static int disp()
 {
	System.out.println("Inside package"+n);
	return(n);
 }
}

//Access modifiers or Access specifiers
/*
public -access from anywhere
default-only in the package
private-only in the class
protected-parent/ child


*/