//����һ���ַ�����ͳ�����пո�Ӣ����ĸ�����ֺ������ַ��ĸ���
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
		String E1="[\u4e00-\u9fa5]";//����
		String E2="[a-zA-Z]";
		String E3="[0-9]";
		String E4="\\s";//�ո�
		//���ַ���ת��Ϊ�ַ�����
		char[] chararray=str.toCharArray();
		//����ֻ����Ϊ�ַ�������**********Ϊʲô�أ�
		//����ռ�����ֽڣ�Ӣ���ַ�ռһ���ַ������԰Ѻ��ֵ����ַ���
		String[] strarray=new String[chararray.length];
		for (int i=0;i<chararray.length ;i++ )
		{
			////Returns the string representation of the char array argument
			strarray[i]=String.valueOf(chararray[i]);
			System.out.println(chararray[i]);
		}
		//�����ַ��������е�Ԫ��
		for (String s:strarray )
		{
			//boolean matches(String regex)����regexΪ������ʽ
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
		System.out.println("����ĺ��Ӹ�����"+countChinese);
		System.out.println("�������ĸ������"+countLetter);
		System.out.println("��������ָ�����"+countNumber);
		System.out.println("����Ŀո������"+countSpace);
		System.out.println("����������ַ�������"+countOther);
	}
}
