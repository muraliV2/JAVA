package fhtest;
import java.io.*;
public class filecrea {
public static void main(String [] args) throws IOException
{
File jvm = new File("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\jdk.mp4");
boolean b = jvm.createNewFile();
if(b)
{
System.out.println("file is created");	
}
else
{
System.out.println("file is not created");	
}
}
}
