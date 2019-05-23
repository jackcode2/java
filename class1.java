
public class class1 {
int i=47;
public void call()
{
	System.out.println("调用call方法");
	for(i=0;i<3;i++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
	public static void main(String[] args)
	{
		class1 t1=new class1();
		class1 t2=new class1();
		t1.i=60;
		System.out.println("第一次调用实例"+t1.i);
	  t1.call();
	  System.out.println("第二次调用实例"+t2.i);
	  t2.call();
		
	}

}
