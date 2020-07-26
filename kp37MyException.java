import java.lang.Exception;
class MyException extends Exception
{
	MyException(String message)
	{
		super (message);
	}
}
class kp37MyException
{
public static void main(String args[])
{
	int x=5,y=100;
	try
	{
		float z=(float)x/(float)y;
		if(z<0.01)
		{
			throw new MyException("Number is too small");
		}
	}
	catch(MyException e)
	{
		System.out.println("Caught my expression");
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("I am always here");
	}
}
}