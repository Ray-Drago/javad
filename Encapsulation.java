import java.io.*;
class Student
{
	String name;
	int age;
	void setname(String sname)
	{
		name=sname;
	}
	void setage(int sage)
	{
		age=sage;
		}
	void getname()
	{
		System.out.println("Name"+name);
	}
    void getage()
	{
		System.out.println("Age"+age);
	}
	}

class Encapsulation
{
public static void main(String args[])
{
Student s=new Student();
s.setname("Akil");
s.setage(123);//setter methods.. to give values to variables
s.getname();
s.getage();//to take values from variables:display
//System.out.println("aaaa");

}
}