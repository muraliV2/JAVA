package practice;
import java.util.Scanner;

public class numberpalindrome 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("enter num");
int num = scn.nextInt();
int copy = num;
int rem =0;
int rev = 0;
while(num>0)
{
rem = num%10;
rev = rev *10 +rem ;
num = num/10;
}
if(rev==copy)
{
System.out.println("the number is palindrome");	
}
else
{
System.out.println("the number is not a palindrome");	
}

}
}
