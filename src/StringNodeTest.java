import java.io.*;
public class StringNodeTest
{
	public static void main(String[] args)
	{
		String src = "��ǰ���¹�\n"+"���ǵ���˪\n"+"��ͷ������\n"+"��ͷ˼����\n";
		char[] buffer = new char[32];
		int hasRead = 0;
		try(
			//�����ַ�������
			//��������ַ����ڵ㣬�����ļ��ڵ�
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
		try(//�����ַ������
			//����String�ǲ��ɱ���ַ�����������Ĭ�ϵ���ʹ��StringBuffer��Ϊ����ڵ�
		StringWriter b = new StringWriter())
		{
			b.write("������ɽ��\n");
			b.write("�ƺ��뺣��\n");
			b.write("Ұ���ղ���\n");
			b.write("���紵����\n");
			//ʹ��toString()��������StringWriter�ַ����ڵ������
			System.out.println(b.toString());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
