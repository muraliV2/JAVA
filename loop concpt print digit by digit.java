package loops;
import java.util.Scanner;
public class a 
{
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
			System.out.println("enter num");
	int num = scn.nextInt();
int rem =0;
while(num>0)
{
	
	rem = num%10;
	System.out.println(rem);
	num = num/10;
	
}
//System.out.println(count);
}
}
