/*import java.io.*;
class Buffer
{
public static void main(String args[]) throws IOException

{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String");
String s=br.readLine();
System.out.println(" String is "+s);
}

}


*/

//String Buffer
class Buffer
{
public static void main(String args[])
{
	StringBuffer s1=new StringBuffer("java is simple");
	s1.replace(1,3,"JAva");
	System.out.println(s1);
}
}

//STRING FUNCTIONS
//System.out.println("Length :"+s1.length());





//System.out.println(s1.replace(3,6,"ja");
/*
System.out.println(s1.codePointAt(1));
System.out.println(s2.concat(s1));
System.out.println(s1.substring(1));
System.out.println(s1.substring(1,5));
}
}
*/