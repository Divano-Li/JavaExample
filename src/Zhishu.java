import java.lang.Math;
public class Zhishu
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i=101;i<200 ;i++ )
		{
			if (isTrue(i))
			{
				count++;
				System.out.print(" "+i);//ע�ⵥ���ź�˫�������ַ�������
			}

		}
		System.out.println("���������ĸ���Ϊ"+count);
	}
	public static boolean isTrue(int n)
	{
		boolean flag=true;
		for (int i=2;i<=Math.sqrt(n) ;i++ )
		{
			if (n%i==0)
			{
				flag=false;
				return flag;
			}
		}
		return flag;
	}
}