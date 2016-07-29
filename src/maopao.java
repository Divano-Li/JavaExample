import java.util.*;
public class maopao
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("输入一串数列");
		int[] a=input.nextInt();
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{	
				    int	temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int a1 : a)
		{
			System.out.print(a1+" ");	
		}
	}
}