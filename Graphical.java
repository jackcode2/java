
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
		System.out.println("Բ�ı߳��ǣ�"+radious);
		System.out.println("Բ������ǣ�"+area);
	}
}
class Spherical {
	double radious;
	double volume;
	public Spherical(double radious)
	{
		this.radious=radious;
		volume=4/3*Graphical.PI*radious*radious*radious;
		System.out.println("��ı߳��ǣ�"+radious);
		System.out.println("�������ǣ�"+volume);
	}
}


