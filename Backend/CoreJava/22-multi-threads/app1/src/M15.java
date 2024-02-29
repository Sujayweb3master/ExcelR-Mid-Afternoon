class L implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("from child thread-1");
	}
}

class K extends Thread 
{
	@Override 
	public void run() 
	{
		System.out.println("from child thread-2");
	}
}
public class M15
{
	public static void main(String[] args)
	{
		L l1 = new L();
		K k1 = new K();
		Thread t1 = new Thread(l1);
		t1.start();
		k1.start();
		System.out.println(t1.getName());

		System.out.println(k1.getName());
	}
}
