import java.io.*;
public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		//创建字节输入流
		FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
			//创建一个长度为1024的字节数组
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(bbuf))>0)
		{
			System.out.print(new String(bbuf , 0 , hasRead ));
		}
		fis.close();
	}
}
