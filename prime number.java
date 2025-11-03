package loops;
import java.util.Scanner;
public class a 
{
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
	System.out.println("enter number");
	int num = scn.nextInt();
	int count=0;
	for(int i = 1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	System.out.println(count);
	if(count ==2)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("not a prime");
	}
}

}
