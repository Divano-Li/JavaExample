import java.io.*;
public class KeyinTest
{
	public static void main(String[] args)
	{
		try(//���������루��׼���룩�ֽ���װ�����ַ���
			//��Ϊ���ǴӼ��̵����붼���ı����ݣ�����ʹ���ַ���
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader sc = new BufferedReader(reader))
		{
				String line = null;
				/*while (sc.readLine() != null)
				{
					line = sc.readLine();
					System.out.println(line+"a");
				}����д�Ǵ����,readLine������*/
				while ((line = sc.readLine()) != null)
				{	
					if (line.equals("exit"))//�˴�����line == "exit"ʱif����������ִ��;
					{
						System.exit(1);
					}
					System.out.println(line);
				}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}