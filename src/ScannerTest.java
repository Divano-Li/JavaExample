//导包
/*import java.util.Scanner;
	public class TextScanner{
		public static void main(String [] args){
		//创建Scanner对象 接受从控制台输入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入名字:");
		//接受String型
		String name = input.next();
		System.out.println("请输入学号");
		//接受int型
		String id = input.next();//什么类型next后面就接什么 注意大小写
		//输出结果
		System.out.println("名字为:"+name+"\t学号为:"+id);
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
