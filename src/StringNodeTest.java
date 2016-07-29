import java.io.*;
public class StringNodeTest
{
	public static void main(String[] args)
	{
		String src = "床前明月光\n"+"疑是地上霜\n"+"举头望明月\n"+"低头思故乡\n";
		char[] buffer = new char[32];
		int hasRead = 0;
		try(
			//创建字符输入流
			//传入的是字符串节点，不是文件节点
			StringReader a = new StringReader(src);)
		{
			while ((hasRead = a.read(buffer))>0)
			{	
				System.out.print(new String(buffer , 0 ,hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		try(//创建字符输出流
			//由于String是不可变的字符串对象，这里默认的是使用StringBuffer作为输出节点
		StringWriter b = new StringWriter())
		{
			b.write("白日依山尽\n");
			b.write("黄河入海流\n");
			b.write("野火烧不尽\n");
			b.write("春风吹又生\n");
			//使用toString()方法返回StringWriter字符串节点的内容
			System.out.println(b.toString());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
