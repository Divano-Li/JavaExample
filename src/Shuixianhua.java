public class Shuixianhua
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i=100;i<=999 ;i++ )
		{
			if(isTrue(i))
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("100-999中总的水仙花数的个数为"+count);
	}
	public static boolean isTrue(int j)
		{
			int ge=j%10;
			int sh=(j/10)%10;
			int ba=(j/100)%10;
			if ((ge*ge*ge+sh*sh*sh+ba*ba*ba)==j)//注意java中的乘方表达式不能用^符号。
												//调用Math.pow(a,b);表示a的b次方
				return true;
			return false;
			
		}
}