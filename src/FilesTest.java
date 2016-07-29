import java.nio.file.*;
public class FilesTest
{
	public static void main(String[] args)
		throws Exception
	{
		Path path = Paths.get("Chengji.java");
		System.out.println(path);
		System.out.println(path.toAbsolutePath());
		Path path1 = Paths.get("e:","JavaF","ClassF","Chengji1.java");
		System.out.println(path1);
		System.out.println(Paths.get("e:\\JavaF\\ClassF\\Chengji2.java"));
	}
}