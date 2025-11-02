package practice;

public class arrayposition 
{
public static void main(String [] args)
{
//int value = 40;
	int min = 20;
int[] a1 = {10,20,30,40,50};

for(int i = 0;i<=a1.length-1;i++)
{
if(a1[i]<min)
{
min = a1[i];
}
}
System.out.println(min);

}
}
