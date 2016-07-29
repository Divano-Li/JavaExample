//重新定向标准输入输出
//重新定向标准输出流，将System.out的输出重新定向到文件输出，问不是在屏幕上
import java.io.*;
public class Reout
{
	public static void main(String[] args)
	{
		try(PrintStream po = new PrintStream(new FileOutputStream("a.txt"));
		FileInputStream pi = new FileInputStream("Reout.java"))
		{
			//将标准输出重新定向到pr标准输出流
			System.setOut(po);
			//将标准输出重新定向到pi标准输入流
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
