import java.nio.file.*;
public class PathTest
{
	public static void main(String[] args)
		throws Exception
	{
	//�Ե�ǰ·������Path����
	Path path = Paths.get(".");
	System.out.println("path�������·����������"+path.getNameCount());
	System.out.println("path�ĸ�·����"+path.getRoot());
	//��ȡpath��Ӧ�ľ���·��
	Path absolutePath = path.toAbsolutePath();
	System.out.println(absolutePath);
	//����·���ĸ�·��
	System.out.println(absolutePath.getRoot());
	//��ȡ����·����������·��������
	System.out.println(absolutePath.getNameCount());
	//�Զ��String������Path����
	Path path2 = Paths.get("E:" , "JavaF" , "ClassF");
	System.out.println(path2);
	}
}
