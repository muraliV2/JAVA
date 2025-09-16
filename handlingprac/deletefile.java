package fhtest;
import java.io.File;
import java.io.*;
public class delefile 
{
public static void main(String [] args) throws IOException
{
	File jdk = new File("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\jdk.mp4");
	boolean isdelete = jdk.delete();
	if(isdelete)
	{
		System.out.println("file is deleted");
		
	}
	else
	{
		System.out.println("file is not deleted");
		
	}
}
}
