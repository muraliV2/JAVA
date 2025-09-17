package constserial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class main 
{
public static void main(String [] args) throws Exception
{
a a1 = new a("murali","ECE",20017);

  FileInputStream fis = new FileInputStream("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\gigi.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
 a a2 = (a)ois.readObject();
System.out.println(a2.name);
System.out.println(a2.dept);
System.out.println(a2.rollno);
System.out.println("deserilization done");
}
}
