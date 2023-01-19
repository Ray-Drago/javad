/*import packs.*;
 class p1Demo
{
public static void main(String args[])
{
p1 obj=new p1();
int c=p1.disp(10,3);
System.out.println("Sum is"+c);
}
}
*/
// package use 2 object files or 2....
import packs.*;

 class p1Demo
{
public static void main(String args[])
{
p1 obj1=new p1();
int x=obj1.disp(10,3);
System.out.println("Sum is"+x);

p2 obj2=new p2();
int y=obj2.disp(10,3);
System.out.println("MUL is"+y);
}
}