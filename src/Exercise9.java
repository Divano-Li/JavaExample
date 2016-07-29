//一个数如果恰好等于它的因子之和，这个数就称为"完数"。
//例如6=1＋2＋3.编程找出1000以内的所有完数。
//什么是数的因子?因子就是所有可以整除这个数的数,不包括这个数自身.　
//因数包括这个数本身而因子不包括,如：比如15的因子是1,3,5 　　而因数为1,3,5,15.　　完数是指此数的所有因子之和等于此数,例如：28=1+2+4+7+14.
import java.util.*;
public class Exercise9
{
	public static void main(String[] args) 
	{	
		long sum=0;
		List<Integer> sc=new LinkedList<>();
		for (int i=2;i<=10000 ;i++ )
		{
			for (int j=1;j<=i/2 ;j++ )
			{
				if (i%j==0)
				{	
					sc.add(j);//直接用用sum+=j;快多了！！不必用集合
				}
			}
			//System.out.print(sc+" ");
			Object[] a=sc.toArray();
			for(Object b:a)
			{
				long c=(Integer)b;
				sum+=c;
			}
			if (sum==i)
			{
				System.out.println(i);
			}
			sum=0;
			sc.clear();
		}
	}
}
