package serial12;

import java.io.Serializable;

public class a  implements Serializable
{
int no = 12;
String name = "prathish";
String team = "mancheester city";
}



package serial12;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main 
{
public static void main(String [] args) throws Exception
{
	a a1 = new a();
	FileOutputStream fos = new FileOutputStream("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\giri.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a1);
	System.out.println("object serialized");
	
	
	//FileInputStream fis = new FileInputStream("C:\\Users\\mural\\OneDrive\\Desktop\\lo\\giri.txt");
	//ObjectInputStream oiis = new ObjectInputStream(fis);
	//a a2 = (a) oiis.readObject();
	//System.out.println("object deserialized");
	//System.out.println(a2.no);
	//System.out.println(a2.name);
	//System.out.println(a2.team);
	

}
}
