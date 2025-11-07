
package practice;
import java.util.Scanner;
public class perfectnumber 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
int sum = 0;

System.out.println("enter num");
int num = scn.nextInt();
for(int i = 1;i<=num-1;i++)
{
	if(num%i==0)
		{
		sum = sum + i;
		}
	}
if(sum==num)
{
	System.out.println(sum);
	System.out.println("it is a perfect number");
}
else
{
	System.out.println(sum);
	System.out.println("it is a not perfect number");
}

}

}
