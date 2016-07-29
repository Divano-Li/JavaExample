//输入两个数m,n;求他们的最大公约数和最小公倍数；
//提示：利用辗转相除法
public class ZhanZhuan 
{
	public static void main(String[] args) 
	{
		int m,n;//此处为方法的局部变量；作用也为整个方法体；
		try
		{
			
			//注意此时的n和m是代码块局部变量，作用域为try代码块 那么method的方法就不能调用了
			//int n=Integer.parseInt(args[0]);
			//int m=Integer.parseInt(args[1]);
			m=Integer.parseInt(args[0]);
			n=Integer.parseInt(args[1]);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.print("输入的参数有异常");
			return;
		}
		method(m,n);
	}
	public static void method(int m,int n)
	{
		int temp =1;
		int sum=m*n;	
			while(temp!=0)
			{
				temp=m%n;
				if (temp==0)
				{
					System.out.println("最大公约数为："+n+'\n'+"最小公倍数为："+sum/n);
					return;
				}
				m=n;
				n=temp;
			}
	}
}
