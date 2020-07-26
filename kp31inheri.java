class maths
{
	int n1,n2,n3,n4,sum;
	maths(int a,int b,int c,int d)
	{
		n1=a;
		n2=b;
		n3=c;
		n4=d;
	}
	int add()
	{
		sum=n1+n2+n3+n4;
		return sum;
	}
}

class ans extends maths
{
	int sum1;
	int avg()	
	{
		sum1=sum;
	}
	int ans()  
	{
		return(sum1/4);
	}
}

class kp31inheri
{
	public static void main(String args[])
	{
		avg num= new avg(10,20,30,40);
		int ans1=num.add();
		int ans2=num.ans();
		System.out.println("SUM= "+ans1);
		System.out.println("AVG= "+ans2);
	}
}