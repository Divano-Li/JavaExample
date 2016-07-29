import java.io.*;
public class FileWriterTest
{
	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("newFile1.txt"))
		{
			fw.write("��ҹ˼-���\r\n");
			fw.write("��ǰ���¹�\r\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}