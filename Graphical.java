
public class Graphical
{
final static double PI=3.1415926;
public static void main(String[] args) {
	Circular c=new Circular(2.0);
	Spherical s=new Spherical(2.0);
}
}
class Circular{
	double radious;
	double area;
	public Circular(double radious)
	{
		this.radious=radious;
		area=Graphical.PI*radious*radious;
		System.out.println("圆的边长是："+radious);
		System.out.println("圆的面积是："+area);
	}
}
class Spherical {
	double radious;
	double volume;
	public Spherical(double radious)
	{
		this.radious=radious;
		volume=4/3*Graphical.PI*radious*radious*radious;
		System.out.println("球的边长是："+radious);
		System.out.println("球的体积是："+volume);
	}
}


