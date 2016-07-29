import java.io.*;
public class FileReaderTest
{
	public static void main(String[] args) throws IOException
	{
		try (//创建字符输入流
			FileReader fr = new FileReader("FileInputStreamTest.java");)
		{
			//创建一个长度为32个字符的字符数组
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