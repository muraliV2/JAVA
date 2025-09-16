package fhtest;
import java.io.*;
import java.util.Scanner;
public class hasnext {
public static void main(String [] args) throws IOException
{
File jdk = new File("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\jdk.txt");
Scanner scn = new Scanner(jdk);
while(scn.hasNext())
{
System.out.println(scn.next());	
}
}
}
