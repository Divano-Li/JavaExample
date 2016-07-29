/*冒泡排序的*/
import java.util.*;
public class shuzudeshuru
{
	 public static void main(String[] args) 
	{
         int i;
         System.out.print("请输入要输入的整数个数");
		 Scanner input = new Scanner(System.in);    //JDK1.5以上
		 int[] array;
		 array = new int[input.nextInt()];
		 System.out.println("要输入"+array.length+"个整数,请开始");
		 for( i=0;i<array.length;i++)
				{
						int num = input.nextInt();
						array[i] = num;
				}
		 for(i=0;i<array.length;i++)
			{
			 for (int j=i;j<array.length ;j++ )
			{
				if (array[i]>array[j])
				{	
				    int	temp=0;
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int a1 : array)
		{
			System.out.print(a1+" ");	
		}
     } 
}