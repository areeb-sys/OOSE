abstract class Parent
{
	public abstract void message();
}
class Subclas extends Parent
{
	public void message()
	{
		System.out.println("This is first Subclass");
	}
}
class Subclass extends Parent
{
	public void message()
	{
		System.out.println("This is second Subclass");
	}
}

class Example1
{
	public static void main(String args[])
	{
		Subclas s1 = new Subclas();
		Subclass s2 = new Subclass();
		
		s1.message();
	}
}