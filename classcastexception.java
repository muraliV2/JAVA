package casting1;

public class bike 
{
public void cc()
{
System.out.println("155cc");
}
public void color()
{
	System.out.println("blue color");
}
}


package casting1;

public class car extends bike 
{
public void cc1()
{
System.out.println("450cc");
}
public void color2()
{
System.out.println("florusent yellow");	
}
}

package casting1;

public class mainmethod 
{
public static void main(String [] args)
{
bike b1 = new car();
car c1 =(car) b1;
c1.cc();
c1.color();
c1.cc1();
c1.color2();

}
}

