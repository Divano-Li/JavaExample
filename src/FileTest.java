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
		//ָ����JVM�˳�ʱɾ�����ļ�
		tmpFile.deleteOnExit();
		//��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis() + " ");
		System.out.println("newFile�����Ƿ���ڣ�"+newFile.exists());
		//ָ��newFile���󣨴�ʱ��ʾĿ¼������Ӧ��Ŀ¼�����ڣ�
		//�������ļ���������ʱ���ĸ�Ŀ¼�´����أ�
		newFile.createNewFile();
		//��newFile����������һ��Ŀ¼����ΪnewFile�Ѿ����ڣ�������Ϊʲô���false��
		//�������淽������false�����޷�������Ŀ¼
		System.out.println(newFile.mkdir());
		//ʹ��list()�����г���ǰ·���µ������ļ���·��
		String[] fileList = file.list();
		for (String fileName : fileList )
		{
			System.out.println(fileName);
		}
		//listRoots()��̬�ŷ��г����еĴ��̸�·��
		File[] roots = File.listRoots();
		for (File root : roots )
		{
			System.out.println(root);
		}
		
	}
}