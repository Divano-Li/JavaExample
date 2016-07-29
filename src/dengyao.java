import java.util.*;
public class dengyao 
{	
	public static void main(String[] args)
	{	
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int n=input.nextInt();
		char[] array=new char[n];
		for (int i=0;i<n ;i++ )
		{	
			array[i]=' ';
		}
		for (int j=1;j<=n ;j++ )
		{		
			for (int i=0;i<n-j ;i++ )
			{	
				System.out.print(array[i]);
			}	
			for (int k=1;k<=2*j-1 ;k++ )
			{
				System.out.print("*");
			}
			System.out.print("\n");	
		}
	}
}