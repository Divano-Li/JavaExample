import java.io.*;
public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		//�����ֽ�������
		FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
			//����һ������Ϊ1024���ֽ�����
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(bbuf))>0)
		{
			System.out.print(new String(bbuf , 0 , hasRead ));
		}
		fis.close();
	}
}
