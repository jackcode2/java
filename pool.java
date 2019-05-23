
public class pool {
static public int  water=0;
public void intlet()
{
	water+=3;
}
public void outlet()
{
	if(water>=2)
	{
		water-=2;
	}
	else
	{
		water=0;
	}
}
	public static void main(String[] args) {
		pool out =new pool();
		pool in =new pool();
		System.out.println("第一次水的量为"+pool.water);
		in.intlet();
		in.intlet();
		System.out.print("第二次水的量为 :"+pool.water);
        out.outlet();
        System.out.println();
        System.out.print("第三次水的量为"+pool.water);
	}

}
