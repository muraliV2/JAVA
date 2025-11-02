package practice;

public class fibonacciseries 
{
public static void main(String [] args)
{
	int num = 10;
	int n1 = 0;
	int n2 = 1;
	int n3 = n1 + n2;
	while(num>0)
	{
		System.out.println(n1);
		n1 = n2;
		n2 = n3;
		n3 = n1 + n2 ;
		num --;
	}
}
}
