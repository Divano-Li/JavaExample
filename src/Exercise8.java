//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
//例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
//程序分析：关键是计算出每一项的值。
import java.util.*;
public class Exercise8
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		System.out.print(show(m,n)+method(m,n));
	}
	private static long method(int m,int n)
	{	
		long temp=0;
		long sum=0;
		for (int i=0;i<n ;i++ )
		{
			temp=sum*10+m;
			sum=sum+temp;
		}
		return sum;
	}
	//此处添加一个求和表达式的方法
	private static String show(int m,int n)
	{
		StringBuffer str=new StringBuffer();
		StringBuffer str1=new StringBuffer();
		for (int i=1;i<=n ;i++ )
		{
			str1=str1.append(m);
			str=str.append(str1);
			if (i<n)
			{
				str.append("+");
			}
		}
		str.append("=");
		return str.toString();
	}
}
