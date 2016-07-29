import java.io.*;
public class KeyinTest
{
	public static void main(String[] args)
	{
		try(//将键盘输入（标准输入）字节流装换成字符流
			//因为我们从键盘的输入都是文本内容，可以使用字符流
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader sc = new BufferedReader(reader))
		{
				String line = null;
				/*while (sc.readLine() != null)
				{
					line = sc.readLine();
					System.out.println(line+"a");
				}这样写是错误的,readLine多用了*/
				while ((line = sc.readLine()) != null)
				{	
					if (line.equals("exit"))//此处当用line == "exit"时if语句根本不会执行;
					{
						System.exit(1);
					}
					System.out.println(line);
				}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}