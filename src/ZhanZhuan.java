//����������m,n;�����ǵ����Լ������С��������
//��ʾ������շת�����
public class ZhanZhuan 
{
	public static void main(String[] args) 
	{
		int m,n;//�˴�Ϊ�����ľֲ�����������ҲΪ���������壻
		try
		{
			
			//ע���ʱ��n��m�Ǵ����ֲ�������������Ϊtry����� ��ômethod�ķ����Ͳ��ܵ�����
			//int n=Integer.parseInt(args[0]);
			//int m=Integer.parseInt(args[1]);
			m=Integer.parseInt(args[0]);
			n=Integer.parseInt(args[1]);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.print("����Ĳ������쳣");
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
					System.out.println("���Լ��Ϊ��"+n+'\n'+"��С������Ϊ��"+sum/n);
					return;
				}
				m=n;
				n=temp;
			}
	}
}
