//将文件中的"new PushBackTest"字符串之前的内容输出出来 使用PushBackInputStream和PushBackOutputStream流
		
import java.io.*;
public class PushBackTest
{
	public static void main(String[] args)
	{
		try(PushbackReader pr = new PushbackReader(new FileReader("PushBackTest.java"),64))
		{
			char[] a = new char[32];
			int hasRead = 0;
			int index = 0;
			String lastcontent = "";
			while ((hasRead = pr.read(a))>0)
			{
				String content = new String(a , 0 , hasRead);
				//System.out.print(new String(a , 0 , hasRead));
				if ((index = (lastcontent + content).indexOf("new PushbackReader")) > 0)
				{
					if (index > 32)
					{
						 a = new char[index];
					}
					pr.unread((lastcontent + content).toCharArray());
					pr.read(a , 0 , index);
					lastcontent = new String(a , 0 , index);
					System.out.print(lastcontent);
					System.out.println("接下来就是关键词后面的文件内容");
					break;
				}
				else 
				 {
					System.out.print(lastcontent);
					lastcontent = content;
				}
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
