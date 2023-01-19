 
 
 /*
 // file method 1
import java.io.*;
class Filemethod
{
public static void main(String args[])
{
try
{
	File f1=new File("E:\\AJITH\\test3.txt");// to show specified folder
	boolean fc=f1.createNewFile();
	if(fc)
	{
		System.out.println("file  created");
	}
		else
		{
			System.out.println("Not created");
	}
		
}
	
catch(IOException e)
{
System.out.println(e);
}
}

}
*/

/*
//2nd method-FILEOUTPUTSTREAM

import java.io.*;
class Filemethod
{
public static void main(String args[])
{
try
{
	FileOutputStream f1=new FileOutputStream("jkk.txt");// to show specified folder
	
		System.out.println("file  created");
	
}
	
catch(IOException e)
{
System.out.println(e);
}
}
}
*/

// 3-METHOD TO USE Path getpath
import java.io.*;
import java.nio.file.*; //TO USE PATH USE THIS EXTENSION 
class Filemethod
{
public static void main(String args[])
{
try
{
	Path pf=Paths.get("E:\\AJITH\\test5.txt"); //get path
	Path p=Files.createFile(pf);
        System.out.println("file  created"+pf);

}
	
catch(IOException e)
{
System.out.println(e);
}
}
}