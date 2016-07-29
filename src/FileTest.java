import java.io.*;
public class FileTest
{
	public static void main(String[] args)
		throws IOException
	{
		File file =new File(".");
		System.out.print(file.exists());
		System.out.print(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		File tmpFile = File.createTempFile("aaa", ".txt", file);
		//指定当JVM退出时删除该文件
		tmpFile.deleteOnExit();
		//以系统当前时间作为新文件名来创建新文件
		File newFile = new File(System.currentTimeMillis() + " ");
		System.out.println("newFile对象是否存在："+newFile.exists());
		//指定newFile对象（此时表示目录，但对应的目录不存在）
		//来创建文件——那这时在哪个目录下创建呢？
		newFile.createNewFile();
		//以newFile对象来创建一个目录，因为newFile已经存在（那上面为什么输出false）
		//所以下面方法返回false，即无法创建该目录
		System.out.println(newFile.mkdir());
		//使用list()方法列出当前路径下的所有文件和路径
		String[] fileList = file.list();
		for (String fileName : fileList )
		{
			System.out.println(fileName);
		}
		//listRoots()静态放法列出所有的磁盘根路径
		File[] roots = File.listRoots();
		for (File root : roots )
		{
			System.out.println(root);
		}
		
	}
}