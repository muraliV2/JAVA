
package fhtest;
import java.io.*;
public class foldercrea 
{
public static void main(String [] args)
{
File java = new File("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java")	;
boolean iscreated = java.mkdirs();
if(iscreated)
{
System.out.println("folder is created");	
}
else
{
System.out.println("folder is not created");	
}
}
}
