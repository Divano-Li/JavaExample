import java.io.*;
public class FileWriterTest
{
	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("newFile1.txt"))
		{
			fw.write("静夜思-李白\r\n");
			fw.write("窗前明月光\r\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}