import java.util.Scanner;
class solution
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("enter value");
int x = scn.nextInt();
int copy = x;
int rem = 0;
int rev = 0;

while(x>0)
{
rem = x%10;
rev = rev*10+rem;
x = x/10; 
}
if(copy==rev)
{
    System.out.println("palindrome number");
}
else
{
    System.out.println("not a palindrome number");
}
}

}
