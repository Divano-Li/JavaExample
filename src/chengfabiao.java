//利用for循输出99乘法表；
public class chengfabiao
{	
	public static void main(String[] args)
	{		
			//nt temp=0;
			for (int i=1;i<10 ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					//temp=i*j;
					System.out.print(i+"*"+j+"="+i*j+",");
				}
				System.out.print("\n");
			}
	}
}