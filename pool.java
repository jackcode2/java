
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
		System.out.println("��һ��ˮ����Ϊ"+pool.water);
		in.intlet();
		in.intlet();
		System.out.print("�ڶ���ˮ����Ϊ :"+pool.water);
        out.outlet();
        System.out.println();
        System.out.print("������ˮ����Ϊ"+pool.water);
	}

}
