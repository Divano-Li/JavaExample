/*ð�������*/
import java.util.*;
public class shuzudeshuru
{
	 public static void main(String[] args) 
	{
         int i;
         System.out.print("������Ҫ�������������");
		 Scanner input = new Scanner(System.in);    //JDK1.5����
		 int[] array;
		 array = new int[input.nextInt()];
		 System.out.println("Ҫ����"+array.length+"������,�뿪ʼ");
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