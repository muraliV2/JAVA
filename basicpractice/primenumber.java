
package practice;
import java.util.Scanner;
public class primenumber 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
int count = 0;

System.out.println("enter num");
int num = scn.nextInt();
for(int i = 1;i<=num;i++)
{
	if(num%i==0)
		{
		count++;
		System.out.println(i);
		}

	}

if(count==2)
{
	System.out.println(count);
	System.out.println("it is a prime number");
}
else
{
	System.out.println(count);
	System.out.println("it is a not prime number");
}

}

}
