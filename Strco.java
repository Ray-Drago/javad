import java.util.*;
class Strco
{
public static void main(String args[])
{
System.out.println("Enter a string:");
String s1=System.console().readLine();
System.out.println("String is"+s1);
String s2="Te st";


System.out.println("Length :"+s1.length());
System.out.println(s1.codePointAt(1));
System.out.println(s2.concat(s1));
System.out.println(s1.substring(1));
System.out.println(s1.substring(1,5));

}
}