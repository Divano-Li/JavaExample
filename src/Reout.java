//���¶����׼�������
//���¶����׼���������System.out��������¶����ļ�������ʲ�������Ļ��
import java.io.*;
public class Reout
{
	public static void main(String[] args)
	{
		try(PrintStream po = new PrintStream(new FileOutputStream("a.txt"));
		FileInputStream pi = new FileInputStream("Reout.java"))
		{
			//����׼������¶���pr��׼�����
			System.setOut(po);
			//����׼������¶���pi��׼������
			System.setIn(pi);
			int hasRead = 0;
			byte[] a = new byte[32];
			while ((hasRead = pi.read(a))>0)
			{
				po.print(new String(a, 0 ,hasRead));
				
			}

		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
