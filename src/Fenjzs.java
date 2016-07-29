import java.lang.*;
import java.util.*;
public class Fenjzs//分解质因数
{	
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");
		method(n);
	}
	public static void method(int n)
	{	
		boolean flag=true;
		while (flag)
		{	
			for (int i=2;i<=n ;i++ )
			{	
				if (n%i==0&&n!=i)
				{	
					System.out.print(i+"*");
					n/=i;
				}
				else if (n==i)
				{
					System.out.print(i);
					flag=false;

				}
			}
		}
	}
}
