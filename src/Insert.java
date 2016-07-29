//向指定文件的指定位置插入文件使用RandomAccessFile类创建文件
import java.io.*;
public class Insert
{
	public static void insert(String s,String name,long index)
		throws IOException
	{
		File tmp = File.createTempFile("tmp",null);
		tmp.deleteOnExit();
		try(RandomAccessFile ra = new RandomAccessFile(name,"rw");
		FileInputStream fi = new FileInputStream(tmp);
		FileOutputStream fo = new FileOutputStream(tmp))
		{	
			System.out.print(ra.getFilePointer());
			ra.seek(index);
			byte[] b =new byte[32];
			int hasRead = 0;
			while ((hasRead = ra.read(b))>0)
			{
				fo.write(b, 0 , hasRead);
			}
			ra.seek(index);
			ra.writeBytes(s);
			hasRead = 0;
			while ((hasRead = fi.read(b))>0)
			{
				ra.write(b, 0 , hasRead);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args)
	throws IOException
	{
		insert("*********************************","a.txt", 10);
	}
}
