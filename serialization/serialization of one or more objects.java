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
a a3 = new a("nithish","ECE",20024);
FileOutputStream f = new FileOutputStream("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\gigi.ser");
ObjectOutputStream oos = new ObjectOutputStream(f);
oos.writeObject(a1);
oos.writeObject(a3);
System.out.println("serilization done");
FileInputStream fis = new FileInputStream("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\java\\gigi.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
 a a5 = (a)ois.readObject();
 a a4 = (a)ois.readObject();
System.out.println(a5.name);
System.out.println(a5.dept);
System.out.println(a5.rollno);
System.out.println(a4.name);
System.out.println(a4.dept);
System.out.println(a4.rollno);
System.out.println("deserilization done");
}
}
