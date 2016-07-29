import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.WriteAbortedException;

public class ReadWriteCharStream {
	public static void main(String[] args){

			try {
				File file = new File("test.txt");
				FileInputStream fis = new FileInputStream(file);
				//���ֽ���ת�����ַ���
				InputStreamReader isr = new InputStreamReader(fis);
				char input[] = new char[100];
				int l =0;
				while((l=isr.read(input))!=-1){
					System.out.println(new String(input,0,l));
				}
				isr.close();
				fis.close();
		//----------------------------------------------------------
			//ͨ���ַ���ʵ���ļ���copy
				FileInputStream fis1 = new FileInputStream("test.txt");
				FileOutputStream fos1 = new FileOutputStream("test2.txt");
				InputStreamReader isr1 = new InputStreamReader(fis1);
				OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
				char input1[] = new char[100];
				int l1 = 0;
				while ((l1=isr1.read(input1))!=-1){
					osw1.write(input1, 0, l1);
				}
				osw1.close();
				fos1.close();	
				isr1.close();
				fis1.close();
		//------------------------------------------------------------
			//ͨ�������ַ���ʵ���ļ���copy
				//������ַ�����һ���ľ����ԣ��ַ�������isr1 read �������ܶ�ȡ�ַ�����ֻ�ܶ�ȡ�ַ�����
								// �ַ������ osw1 Write ��������дһ���ַ������Զ����С�
				FileInputStream fis2 = new FileInputStream("test.txt");
				FileOutputStream fos2 = new FileOutputStream("test2.txt");
				InputStreamReader isr2 = new InputStreamReader(fis2);
				OutputStreamWriter osw2 = new OutputStreamWriter(fos2);
				BufferedReader br2 = new BufferedReader(isr2);
				//BufferedWriter bw2 = new BufferedWriter(osw2);
				PrintWriter pw2 = new PrintWriter(osw2,true);
				String input2;
				//��ȡһ�У������з��ᶪʧ,������Printwriter���print����
				while((input2 =br2.readLine())!=null){
					//bw2.write(input2);
					//osw2��write������bw2��write������һ���ģ�����bw2�л������������������˺�Ż�д�룬���ӳ�Ӳ��ʹ������
					pw2.println(input2);
				}
				//bw2.close();
				//pw2.flush();//����ǰ���л�����������ǿ���������֤�ļ��������� ���ڶ���ʱtrue��
				pw2.close();
				osw2.close();
				fos2.close();
				br2.close();
				isr2.close();
				fis2.close();
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
	
			
			
			
			
		
		
	}
}
