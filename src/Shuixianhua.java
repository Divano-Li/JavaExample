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
		System.out.println("100-999���ܵ�ˮ�ɻ����ĸ���Ϊ"+count);
	}
	public static boolean isTrue(int j)
		{
			int ge=j%10;
			int sh=(j/10)%10;
			int ba=(j/100)%10;
			if ((ge*ge*ge+sh*sh*sh+ba*ba*ba)==j)//ע��java�еĳ˷����ʽ������^���š�
												//����Math.pow(a,b);��ʾa��b�η�
				return true;
			return false;
			
		}
}