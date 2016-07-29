public class Exercise10  
{
	public static void main(String[] args) 
	{
		double n=100;
		method(n);
	}
	private static void method(double n)
	{	
		double sum=n;
		n=n/2;
		for (int i=1;i<10 ;i++ )
		{
			sum=sum+n*2;
			n=n/2;
			System.out.println("第"+(1+i)+"次下落的经过的距离为："+sum+' '+"弹起的距离为："+n);
			System.out.println("**********************************************************");
		}

		
	}
}
