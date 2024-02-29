import java.util.HashSet;

class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i = " + i + ")";
	}
	public int hashCode()
	{
		System.out.println("Hash code of " + this + "is: " + i);
		return i;
	}
	public boolean equals(Object obj)
	{
		return i == ((A)obj).i;
	}
}
public class M2
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		set.add(10);
		set.add(10);
		//becase of hashCode and equals method we get the unique element.	
		System.out.println(set);
	}
}