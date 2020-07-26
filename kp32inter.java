interface Area
{
	final static float pi=3.142F;
	float compute (float x, float y);
}
class rectangle implements Area
{
	public float compute (float x, float y)
	{
		return (x*y);
	}
}
class circle implements Area
{
	public float compute (float x, float y)
	{
		return (pi*x*x);
	}
}

class kp32inter
{
	public static void main(String args[])
	{
		rectangle rect =new rectangle();
		circle cir= new circle();
		Area area;
		area=rect;
		System.out.println("Area of rectangle= "+area.compute(10,20));
		area=cir;
		System.out.println("Area of rectangle= "+area.compute(10,0));
	}
}