import java.util.*;

//不提供异常处理的程序
/*public class ChengJi
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int n=sc.nextInt();
		method(n);
	}
	static void method(int n)
	{
		System.out.print(n>=90?"a":n>=60?"b":"c");
	}
}*/


//提供异常处理的程序
public class ChengJi
{
	public static void main(String[] args)
	{
		try
	{
		int n=Integer.parseInt(args[0]);
		method(n);	
	}
	catch (IndexOutOfBoundsException e)
	{
		System.out.println("请重新输入成绩：");
		return;	
	}
	}
	static void method(int n)
	{
		System.out.print(n>=90?"a":n>=60?"b":"c");
	}
}