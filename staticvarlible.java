
public class staticvarlible {
static int  x;
int y;
public staticvarlible(int x,int y)
{
	this.x=x;
	this.y=y;
}
public static void main(String[] args) {
	staticvarlible a=new staticvarlible(1,2);
	staticvarlible b=new staticvarlible(12,4);
			System.out.println("a.x��ֵ��="+a.x);
			System.out.println("a.y��ֵ��="+a.y);
			System.out.println("b.x��ֵ��="+b.x);
			System.out.println("b.y��ֵ��="+b.y);
}
}

