import java.util.*;

//���ṩ�쳣����ĳ���
/*public class ChengJi
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ���");
		int n=sc.nextInt();
		method(n);
	}
	static void method(int n)
	{
		System.out.print(n>=90?"a":n>=60?"b":"c");
	}
}*/


//�ṩ�쳣����ĳ���
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
		System.out.println("����������ɼ���");
		return;	
	}
	}
	static void method(int n)
	{
		System.out.print(n>=90?"a":n>=60?"b":"c");
	}
}