class Student
{
	int rollNo;
	void getNo(int n)
	{
		rollNo=n;
	}
	void putNo()
	{
		System.out.println("Roll No: "+rollNo);
	}
}
class Test extends Student
{
	float part1,part2;
	void getMarks(float m1, float m2)
	{
		part1=m1;
		part2=m2;
	}
	void putMarks()
	{
		System.out.println("Marks Obtained");
		System.out.println("Part 1= "+part1);
		System.out.println("Part 2= "+part2);
	}
}
interface Sports
{
	float sportWt=6.0F;
	void putWt();
}
class Results extends Test implements Sports
{
	float total;
	public void putWt()
	{
		System.out.println("Sports Wt= "+sportWt);
	}
	void display()
	{
		total =part1+part2+sportWt;
		putNo();
		putMarks();
		putWt();
		System.out.println("Total score= "+total);
	}
}

class kp33mulinheri
{
	public static void main(String args[])
	{
		Results stud1=new Results();
		stud1.getNo(1234);
		stud1.getMarks(27.5F,33.0F);
		stud1.display();
	}
}