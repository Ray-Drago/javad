// final
//final variable 
/*
import java.io.*;


class FinDemo
{
public static void main(String args[])
{
int i=10;
System.out.println("i is "+i);
i=i+10;
System.out.println("i is "+i);
final int j=10;
System.out.println("j is "+j);

}
}
*/
// final class
/*
import java.io.*;
class Animal
{
public Animal(){System.out.println("Aniaml cons");}
public void eat(){System.out.println("Aniaml EATS");}

}
final class Cat extends Animal
{
public Cat(){System.out.println("Cat cons");}
public void eat()
 {
	 System.out.println("Cat EATS");}
}
class Persian extends Cat{}

class Findemo
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/
// final method-to prevent overriding 
import java.io.*;
class Animal
{
public Animal(){System.out.println("Aniaml cons");}
public final void eat(){System.out.println("Aniaml EATS");}

}
final class Cat extends Animal
{
public Cat(){System.out.println("Cat cons");}
public void eat()
 {
	 System.out.println("Cat EATS");
 }
}
class Persian extends Cat{}

class Findemo
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}