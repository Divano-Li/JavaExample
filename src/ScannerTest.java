//����
/*import java.util.Scanner;
	public class TextScanner{
		public static void main(String [] args){
		//����Scanner���� ���ܴӿ���̨����
		Scanner input = new Scanner(System.in);
		System.out.println("����������:");
		//����String��
		String name = input.next();
		System.out.println("������ѧ��");
		//����int��
		String id = input.next();//ʲô����next����ͽ�ʲô ע���Сд
		//������
		System.out.println("����Ϊ:"+name+"\tѧ��Ϊ:"+id);
	}
}*/
import java.util.*;
 public class ScannerTest 
{
	 public static void main(String[] args)
	 {
        /* Scanner scanner=new Scanner(System.in);
         double a=scanner.nextDouble();
         System.out.println(a);*/
		 int[] a=new int[]{1,2,3,4,8,6,7,5};
		 int[] a1=new int[]{1,2,3,4};
		 boolean b=Arrays.equals(a,a1);
		 System.out.println(b);
		 Arrays.sort(a);
		 for(int a2 : a)
			 System.out.print(a2);
		 System.out.println(Arrays.toString(a));
	}
 }
