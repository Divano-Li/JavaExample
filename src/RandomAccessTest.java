//ʹ��RandomAccessFile�������ļ���ָ�����м䲿������
import java.io.*;
public class RandomAccessTest
{
	public static void main(String[] args) 
	{
		try(RandomAccessFile pr = new RandomAccessFile("RandomAccessTest.java","r");
		RandomAccessFile pl = new RandomAccessFile("a.txt","rw"))
		{
			System.out.println("RandomAccesFile�ļ�ָ��ĳ���λ�ã� "+pr.getFilePointer());
			pr.seek(300);
			byte[] a = new byte[30];
			int hasRead = 0;
			pl.seek(pl.length());
			while ((hasRead = pr.read(a))>0)
			{
				pl.write(a , 0 ,hasRead);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
