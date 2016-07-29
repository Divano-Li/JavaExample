import java.io.*;
public class FileOutputStreamTest
{
	public static void main(String[] args) 
	{
		try(//创建字节输入流
		FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
		//创建字节输出流
		FileOutputStream fos = new FileOutputStream("newFile.txt"))
		{
			byte[] b = new byte[32];
			int hasRead = 0;
			//循环从输入流中取出数据
			while ((hasRead = fis.read(b)) > 0)
			{
				fos.write(b , 0 ,hasRead);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
