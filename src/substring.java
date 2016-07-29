import java.util.*;
public class substring
{
	public static void main(String[] args)
	{	//String是一个字符串类，类的定义方法：String str=new String("hello");
		//只不过也可以写成String str="hello";记住String不是基本类型，基本类型只有8种
		String a=new String();//"中";
		System.out.println(a);
		//array= new char[]{'东北大学秦皇岛分校'};
		byte[] b=a.getBytes();//方法的调用
		for(byte c : b)
			System.out.print(c);
		Scanner input=new Scanner(System.in);
		//System.out.println("请输入一个起始地索引");
		int a1=input.nextInt();
		int a2=input.nextInt();
		byte[] a3=Arrays.copyOfRange(b,a1,a2);
		for(byte b1 : a3)
			System.out.print(b1); 
	}
}