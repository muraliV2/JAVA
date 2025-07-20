import java.util.Scanner;
class qw
{
String name;
int regno;
String room;
String area;

public qw(String a,int b,String c,String d)
{
this.name =a;
this.regno =b;
this.room =c;
this.area = d;
System.out.println("-----result----");


}
}

class zx
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		for(int i = 1;i<=3;i++)
		{
		System.out.println("result");
		
		System.out.println("enter name");
		String a = scn.next();
		
		System.out.println("enter regno");
		int b = scn.nextInt(); 
		
		System.out.println("enter room");
		String c = scn.next();
		
		System.out.println("enter area");
		String d = scn.next();
		
		qw q = new qw(a,b,c,d);
		
		System.out.println("name =" +a);
System.out.println("regno =" +b);
System.out.println("room =" +c);
System.out.println("area =" +d);
		
		
		
	}
}
}

