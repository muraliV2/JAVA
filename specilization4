package travel;

public interface travelpackage 
{
public void location();
public void cost();
public void days();
}

package travel;

public class china implements travelpackage
{
	public void location()
	{
		System.out.println("chosen location is china");
	}
	public void cost()
	{
		System.out.println("the cost is $2800");
	}
	public void days()
	{
		System.out.println("the travel period upto 12 days");
	}

}

package travel;

public class dubai implements travelpackage
{
	public void location()
	{
		System.out.println("chosen location is dubai");
	}
	public void cost()
	{
		System.out.println("the cost is $4000");
	}
	public void days()
	{
		System.out.println("the travel period upto 5 days");
	}

}

package travel;

public class maldives implements travelpackage
{
	public void location()
	{
		System.out.println("chosen location is maldives");
	}
	public void cost()
	{
		System.out.println("the cost is $3000");
	}
	public void days()
	{
		System.out.println("the travel period upto 3 days");
	}

}

package travel;

public class paris implements travelpackage
{
	public void location()
	{
		System.out.println("chosen location is paris");
	}
	public void cost()
	{
		System.out.println("the cost is $5000");
	}
	public void days()
	{
		System.out.println("the travel period upto 10 days");
	}

}

package travel;

public class help 
{
public void get(travelpackage t)
{
if(t instanceof bali)
{
bali b =(bali)t;
b.location();
b.cost();
b.days();
}
else if(t instanceof paris)
{
paris p =(paris)t;
p.location();
p.cost();
p.days();
}
else if(t instanceof dubai)
{
dubai d =(dubai)t;
d.location();
d.cost();
d.days();
}
else if(t instanceof maldives)
{
maldives m =(maldives)t;
m.location();
m.cost();
m.days();
}
else
{
china c =(china)t;
c.location();
c.cost();
c.days();
}
}
}

package travel;
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
case 1 : h1.get(new bali());
	break;
case 2 : h1.get(new paris());
	break;
case 3 : h1.get(new dubai());
	break;
case 4 : h1.get(new maldives());
	break;
case 5 : h1.get(new china());
	break;
default : System.out.println("the chosen option is invalid");
break;
	
}

}
}
