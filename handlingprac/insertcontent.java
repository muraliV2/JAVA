package fhtest;
import java.io.*;
public class insertcon 
{
public static void main(String [] args) throws IOException
{
File jdk = new File("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\jdk.txt");
FileWriter fe = new FileWriter(jdk);

fe.append("hi kid how are you");
fe.flush();
}
}
