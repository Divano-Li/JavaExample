//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"��
//����6=1��2��3.����ҳ�1000���ڵ�����������
//ʲô����������?���Ӿ������п����������������,���������������.��
//���������������������Ӳ�����,�磺����15��������1,3,5 ����������Ϊ1,3,5,15.����������ָ��������������֮�͵��ڴ���,���磺28=1+2+4+7+14.
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
					sc.add(j);//ֱ������sum+=j;����ˣ��������ü���
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
