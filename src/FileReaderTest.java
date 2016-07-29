import java.io.*;
public class FileReaderTest
{
	public static void main(String[] args) throws IOException
	{
		try (//�����ַ�������
			FileReader fr = new FileReader("FileInputStreamTest.java");)
		{
			//����һ������Ϊ32���ַ����ַ�����
			char[] cbuf = new char[32];
			int hasRead = 0;
			while ((hasRead = fr.read(cbuf)) > 0)
			{
				System.out.print(new String(cbuf , 0 ,hasRead));
			}
			System.out.print(hasRead);
		}
		catch (IOException ex )
		{
			ex.printStackTrace();
		}
	}
}