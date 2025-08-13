package car;

public interface car 
{
public void price();
public void topspeed();
public void fueltype();

}


package car;

public class tesla implements car
{
public void price()
{
System.out.println("60 lakhs");	
}
public void topspeed()
{
System.out.println("200 kmph");	
}
public void fueltype()
{
	
System.out.println("its ev bruh");
}
}


package car;

public class toyoto implements car
{
public void price()
{
	System.out.println("40 lakhs");
	}
public void topspeed()
{
System.out.println("180kmph");	
}
public void fueltype()
{
System.out.println("petrol");	
}
}


package car;

public class bmv implements car 
{
	public void price()
	{
		System.out.println("50 lakhs");
		}
	public void topspeed()
	{
	System.out.println("240kmph");	
	}
	public void fueltype()
	{
	System.out.println("petrol");	
	}
	}


package car;

public class ford implements car
{
public void price()
{
	System.out.println("24 lakhs");
	}
public void topspeed()
{
System.out.println("160kmph");	
}
public void fueltype()
{
System.out.println("diesel");	
}
}


package car;

public class help 
{
public void get(car c )
{
if(c instanceof tesla)
{
tesla t = (tesla)c;
t.price();
t.topspeed();
t.fueltype();
}
else if(c instanceof toyoto)
{
toyoto tt = (toyoto)c;
tt.price();
tt.topspeed();
tt.fueltype();
}
else if(c instanceof bmv)
{
bmv b = (bmv)c;
b.price();
b.topspeed();
b.fueltype();
}
else 
{
ford f = (ford)c;
f.price();
f.topspeed();
f.fueltype();
}
	

}
}


package car;
import java.util.Scanner;
public class mainmethod 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
help h1 = new help();
System.out.println("enter choice");
int choice = scn.nextInt();
switch(choice)
{
case 1 : h1.get(new tesla());
	break;
case 2 : h1.get(new toyoto());
	break;
case 3 : h1.get(new bmv());
	break;
case 4 : h1.get(new ford());
	break;
default : System.out.println("invalid choice");
break;
}
}
}
