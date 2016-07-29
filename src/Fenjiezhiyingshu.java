import java.lang.*;
import java.util.*;
public class Fenjiezhiyingshu
{	
	static int k=0;
	static int[] cunzhishu=new int[25];
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[10];
		//寻找100以内的质数的代码块
		{	
			cunzhishu[k++]=2;
			
			for (int i=3;i<=100 ;i++ )
			{
				boolean flag=true;
				for (int j=2;j<=Math.sqrt(i) ;j++ )
				{	
					if (i%j==0)
					{	
						flag=false;
						continue;
						
					}
					
				}
				if (flag)
				cunzhishu[k++]=i;
			}
			for (int temp:cunzhishu )
			{
				System.out.print(temp+" ");
			}

		}	
			//找出质因子
		{	System.out.println();
			boolean flag=true;
			System.out.print(n+"=");
			while(flag)
			{	
				
				for (int i=0;i<=24;i++ )
				{	
					if (cunzhishu[i]==n)
						flag=false;
					if (n%cunzhishu[i]==0)
					{	
						System.out.print(cunzhishu[i]+"*");
						n=n/cunzhishu[i];
						break;
					}
				}
			}
		}
}
}
