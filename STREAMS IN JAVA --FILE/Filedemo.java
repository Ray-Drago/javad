//Q.TO CREATE A FILE AND ENTER DATA INTO ON THE FILE CREATED 

/*
import java.io.*;
class Filedemo
{
public static void main(String args[])
{
try
{
	FileOutputStream f=new FileOutputStream("E://javad//javap//1file.txt");// to show specified folder
	
	DataInputStream d=new DataInputStream(System.in);
	
	System.out.println("Enter the text intop file :");
	String dt=d.readLine();
     f.write(dt.getBytes());	
}
	
catch(IOException e)
{
System.out.println(e);
}
}
}
*/
import java.io.*;
class Filedemo
{
public static void main(String args[])
{
try
{
	FileOutputStream f=new FileOutputStream("E://javad//javap//1file.txt");// to show specified folder
	
	DataInputStream d=new DataInputStream(System.in);
	
	System.out.println("Enter the text intop file  ../ terminate with $:");
	
     while(true)
	 {
		String dt=d.readLine(); 
     if(dt.equals("$"))
	 break;//terminate
       else
	   {
	    f.write(dt.getBytes());//continue writing file
		f.write("\n".getBytes());
	   }
        }
}
catch(IOException e)
{
System.out.println(e);
}
}
}

/*OUTPUT

E:\javad>javac Filedemo.java
Note: Filedemo.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

E:\javad>java Filedemo
Enter the text intop file  ../ terminate with $:
jjjjjjjjjjjjj
ggggggg
yyyyyyy
uuuuuu
$
*/

