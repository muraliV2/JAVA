package thread;
public class getandset implements Runnable
{
public void run()
{
System.out.println("id of the usd :" +Thread.currentThread().getName());	
Thread.currentThread().setName("this thread");
System.out.println("id of the usd :" +Thread.currentThread().getName());	
}
public static void main(String [] args)
{
System.out.println(Thread.currentThread().getName());	
Thread.currentThread().setName("this is main thread");
System.out.println("id of the main :" +Thread.currentThread().getName());	
getandset ti = new getandset();
Thread t1 = new Thread(ti);
t1.start();
}
}
