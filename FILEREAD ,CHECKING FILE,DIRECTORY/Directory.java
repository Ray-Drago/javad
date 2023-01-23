/*

// TO MAKE DIRECTORY --mkdir A -to create directory
// rmkdir -- to remove directory

import java.io.*;
class Directory
{
public static void main(String args[])
{
try
{
File f=new File("ff");
boolean s=f.mkdir();
if(s)
{
	System.out.println("Directory created");
}else
{
	System.out.println("not created");
}
if(f.exists()) 
{
System.out.println("Directory ??"+f.isDirectory());
System.out.println("File ??"+f.isFile());
}
else{
System.out.println("File does not  Exists");
}
}
catch(Exception e)
{System.out.println(e);}
}
}
*/

/*
//tO make nested FILES IN DIRECTORY
import java.io.*;
class Directory
{
public static void main(String args[])
{
try
{
File f=new File("ff//AA");
boolean s=f.mkdirs();   //make mkdirs to add more folder
if(s)
{
	System.out.println("Directory created");
}else
{
	System.out.println("not created");
}
if(f.exists()) 
{
System.out.println("Directory ??"+f.isDirectory());
System.out.println("File ??"+f.isFile());
}
else{
System.out.println("File does not  Exists");
}
}
catch(Exception e)
{System.out.println(e);}
}
}
*/

/*
//tO LIST FILES IN DIRECTORY
import java.io.*;
class Directory
{
public static void main(String args[])
{
	try{
		File f=new File("packs");
		String s[]=f.list();
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
		catch(Exception e)
              {
				  System.out.println(e);
				  }
}
}
*/
/*
OUTPUT
E:\javad>javac Directory.java

E:\javad>java Directory
ff
p1.class
p1.java
p2.class
p2.java
pr1.java

E:\javad>
*/

import java.io.*;
class Directory
{
static void listall(String p)
{
try{
		File f=new File(p);
		File[]  fa=f.listFiles();
		
		for(File A:fa)
		{
			if(A.isFile())
			{
				System.out.println("File"+A);
				}
		else
		{System.out.println("Dirctory"+A);
	}
			listall(A.getPath());
				
        }
     }
	catch(Exception e)
                 {
				  System.out.println(e);
				  }
}

public static void main(String args[])
{
	listall("packs");
}
}

/*
OUTPUT


E:\javad>javac Directory.java

E:\javad>java Directory
Dirctorypacks\ff
Dirctorypacks\ff\AA
Dirctorypacks\kk
Dirctorypacks\kk\a
Filepacks\p1.class
java.lang.NullPointerException
Filepacks\p1.java
java.lang.NullPointerException
Filepacks\p2.class
java.lang.NullPointerException
Filepacks\p2.java
java.lang.NullPointerException
Filepacks\pr1.java
java.lang.NullPointerException
*/