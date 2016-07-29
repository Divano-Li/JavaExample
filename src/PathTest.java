import java.nio.file.*;
public class PathTest
{
	public static void main(String[] args)
		throws Exception
	{
	//以当前路径创建Path对象
	Path path = Paths.get(".");
	System.out.println("path里包含的路径的数量："+path.getNameCount());
	System.out.println("path的根路径："+path.getRoot());
	//获取path对应的绝对路径
	Path absolutePath = path.toAbsolutePath();
	System.out.println(absolutePath);
	//绝对路径的根路径
	System.out.println(absolutePath.getRoot());
	//获取绝对路径所包含的路径的数量
	System.out.println(absolutePath.getNameCount());
	//以多个String来构建Path对象
	Path path2 = Paths.get("E:" , "JavaF" , "ClassF");
	System.out.println(path2);
	}
}
