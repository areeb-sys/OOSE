abstract class Marks
{
	public abstract double getPercentage();
}
class A extends Marks
{
	private int math_marks;
	private int english_marks;
	private int physics_marks;
	A(int math_marks,int english_marks,int physics_marks)
	{
		this.math_marks = math_marks;
		this.english_marks = english_marks;
		this.physics_marks = physics_marks;
	}
	public int getMathMarks()
	{
		return math_marks;
	}
	public int getEnglishMarks()
	{
		return english_marks;
	}
	public int getPhysicsMarks()
	{
		return physics_marks;
	}
	public void setMathMarks(int math_marks)
	{
		math_marks = 80;
	}
	public void setPhysicsMarks(int physics_marks)
	{
		physics_marks = 70;
	}
	public void setEnglishMarks(int english_marks)
	{
		english_marks = 89;
	}
	
		int sum =  math_marks + english_marks + physics_marks;
	public double getPercentage()
	{
		return (sum*100)/300;
	}
}
class B extends Marks
{
	private int math_marks;
	private int english_marks;
	private int physics_marks;
	private int urdu_marks;
	
	B(int math_marks,int english_marks,int physics_marks,int urdu_marks)
	{
		this.math_marks = math_marks;
		this.english_marks = english_marks;
		this.physics_marks = physics_marks;
		this.urdu_marks = urdu_marks;
	}
	
	public int getMathMarks()
	{
		return math_marks;
	}
	public int getEnglishMarks()
	{
		return english_marks;
	}
	public int getPhysicsMarks()
	{
		return physics_marks;
	}
	public int getUrduMarks()
	{
		return urdu_marks;
	}
	public void setMathMarks(int math_marks)
	{
		 math_marks = 80;
	}
	public void setPhysicsMarks(int physics_marks)
	{
		physics_marks = 70;
	}
	public void setEnglishMarks(int english_marks)
	{
		english_marks = 89;
	}
	public void setUrduMarks(int urdu_marks)
	{
		urdu_marks = 85;
	}
	 int sum =  math_marks + english_marks + physics_marks + urdu_marks;
	public double getPercentage()
	{
		return (sum*100)/400;
	}
}
class Example3
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		
		a.getPercentage();
		b.getPercentage();
	}
}
