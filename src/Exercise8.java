//��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
//����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ� 
//����������ؼ��Ǽ����ÿһ���ֵ��
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
	//�˴����һ����ͱ��ʽ�ķ���
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
