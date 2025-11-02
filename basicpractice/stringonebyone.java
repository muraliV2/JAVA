package practice;

public class stringonebyone 
{
public static void main(String [] args)
{
String s1 = "ekitike";
String rev = "";
for(int i =s1.length()-1;i>=0;i--)
{
 char ch = s1.charAt(i);
 rev = rev + ch;
System.out.println(ch);
}
if(s1.equals(rev))
{
	
System.out.println("the string is palindrome");}


else
{
	System.out.println("string is not a palindrome");}
}
}
