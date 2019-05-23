
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
			System.out.println("a.x的值是="+a.x);
			System.out.println("a.y的值是="+a.y);
			System.out.println("b.x的值是="+b.x);
			System.out.println("b.y的值是="+b.y);
}
}

