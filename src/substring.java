import java.util.*;
public class substring
{
	public static void main(String[] args)
	{	//String��һ���ַ����࣬��Ķ��巽����String str=new String("hello");
		//ֻ����Ҳ����д��String str="hello";��סString���ǻ������ͣ���������ֻ��8��
		String a=new String();//"��";
		System.out.println(a);
		//array= new char[]{'������ѧ�ػʵ���У'};
		byte[] b=a.getBytes();//�����ĵ���
		for(byte c : b)
			System.out.print(c);
		Scanner input=new Scanner(System.in);
		//System.out.println("������һ����ʼ������");
		int a1=input.nextInt();
		int a2=input.nextInt();
		byte[] a3=Arrays.copyOfRange(b,a1,a2);
		for(byte b1 : a3)
			System.out.print(b1); 
	}
}