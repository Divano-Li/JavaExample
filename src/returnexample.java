/*return�Ƿ������ķ���,�ڷ���������return��Ҫ���س������壬
 1��ֻ�з����з���ֵ������Ҫ��;�жϵ�ʱ��Ż���return��
 2��ֻ��ִ�е�return�Ż᷵�ء�
 ����
 int a=1
 if(a==2){
     return;
 }
 �ǲ��᷵�صģ����������ִ�С�
 3����������з���ֵ����ô��������������ж�����������������ĸ�if��֧û��return����ᱨ��*/			
/*public class returnexample
{
	public static void main(String[] args)
	{
		returnexample a=new returnexample();
		a.method();
	}
	public void method()
	{	int i=0;
		for (i=0;i<5 ;i++ )
		{
             if (i>2)
			{
			System.out.println(i);
			continue;//���3 4 5 ��return�����3��break�����3 3
			}
		}
		System.out.println(i);
		
	}
}*/
//��������Ϸ��������Ը�Ϊ����
public class returnexample
{
	public static void main(String[] args)
	{	
		int i=0;
		for (i=0;i<5 ;i++ )
		{
			if (i>2)
			{
				System.out.println(i);
				break;//���3 4 5 ��return�����3��break�����3 3
			}
		}
		System.out.println(i);
	}
}
