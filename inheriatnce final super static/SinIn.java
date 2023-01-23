// Single Inheriatnce

/*import java.io.*;
class Animal
{
public Animal(){System.out.println("Aniaml cons");}
public void eat(){System.out.println("Aniaml EATS");}

}
class Cat extends Animal
{
public Cat(){System.out.println("Cat cons");}
public void eat() {System.out.println("Cat EATS");}

}

class SinIn
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/


// 1.super instance
/*
import java.io.*;
class Animal
{
String col="White";
public void eat(){System.out.println("Aniaml EATS");
System.out.println("Colour:"+coll);
}

}
class Cat extends Animal
{
String col="Black";

public void eat() 
{
	System.out.println("Cat EATS");
	System.out.println("Colour:"+col);
	System.out.println("Colour"+super.coll);}

}

class SinIn
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/

//3 Super constructor
/*
import java.io.*;
class Animal
{
public Animal(){System.out.println("Aniaml cons");}
public void eat(){System.out.println("Aniaml EATS");}

}
class Cat extends Animal
{
public Cat()
{
super();
System.out.println("Cat cons");}
public void eat()
 { 
 System.out.println("Cat EATS");}
}



class SinIn
{
public static void main(String args[])
{
Cat c1=new Cat();
c1.eat();
}
}
*/

