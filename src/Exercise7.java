//输入一行字符串，统计其中空格、英文字母、数字和其它字符的个数
import java.util.*;
public class Exercise7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();//Close this scanner
		count(str);
	}
	private static void count(String str)
	{	
		int countChinese=0;
		int countLetter=0;
		int countNumber=0;
		int countSpace=0;
		int countOther=0;
		String E1="[\u4e00-\u9fa5]";//汉子
		String E2="[a-zA-Z]";
		String E3="[0-9]";
		String E4="\\s";//空格
		//将字符串转化为字符数组
		char[] chararray=str.toCharArray();
		//汉子只能作为字符串处理**********为什么呢？
		//汉子占两个字节，英文字符占一个字符，所以把汉字当成字符串
		String[] strarray=new String[chararray.length];
		for (int i=0;i<chararray.length ;i++ )
		{
			////Returns the string representation of the char array argument
			strarray[i]=String.valueOf(chararray[i]);
			System.out.println(chararray[i]);
		}
		//遍历字符串数组中的元素
		for (String s:strarray )
		{
			//boolean matches(String regex)其中regex为正则表达式
			//Tells whether or not this string matches the given
			if(s.matches(E1))
				countChinese++;
			else if (s.matches(E2))
				countLetter++;
			else if (s.matches(E3))
				countNumber++;
			else if(s.matches(E4))
				countSpace++;
			else countOther++;
			}
		System.out.println("输入的汉子个数："+countChinese);
		System.out.println("输入的字母个数："+countLetter);
		System.out.println("输入的数字个数："+countNumber);
		System.out.println("输入的空格个数："+countSpace);
		System.out.println("输入的其他字符个数："+countOther);
	}
}
