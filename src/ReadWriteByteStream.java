import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//java IO ���
//IO�� ����ȡ�豸�ϵ����ݣ�Ӳ���ļ����ڴ桢���̡�����..
//IO�����ࣺ����������������ֽ������ַ���
//�ֽ��������Դ����������͵����ݣ���MP3��ͼƬ�����֡���Ƶ������һ���ֽھͷ���һ���ֽڣ�java�ж�Ӧ���඼�ԡ�Stream����β
//�ַ��������ܹ������ı����ݣ���txt�ı��ȡ��ڶ�ȡʱ������һ�������ֽڣ��Ȳ���ָ���ı����Ȼ�󽫲鵽���ַ����ء���Ӧ���඼���ԡ�Reader����Writer����β

public class ReadWriteByteStream {

	public static void main(String[] args) {
		try {
			//���ֽ����ļ�
			FileInputStream fis  = new FileInputStream("test.txt");
			byte[] input = new byte[20];
			fis.read(input);
			//Ŀ�����ı��ĵ����ֽ����������������ֽ�ת�����ַ����������
			String inputString = new String(input);
			System.out.println(inputString);
			fis.close();
	//---------------------------------------------------------
			//д���ֽ����ļ�
			FileOutputStream fos = new FileOutputStream("test1.txt");
			String outString = "д������";
			//���ַ���ת�����ֽ�������д��
			byte output[] = outString.getBytes();
			fos.write(output);
			fos.close();
	//---------------------------------------------------------
			//ͨ���ֽ���copy�ļ�
			FileInputStream fis1 = new FileInputStream("test.txt");
			FileOutputStream fos1 = new FileOutputStream("test1.txt");
			 byte input1[] = new byte[50];
			 //���ȶ���50���ֽڵ�input1���� ���ٽ�input1�����е�����д��b.jpg ��
			 int l1 = 0;//��ֹ����copy��ʱ�����Щ�ַ�
			 while ((l1=fis1.read(input1))!=-1){
				 fos1.write(input1,0,l1);
			 }
			 fis1.close();
			 fos1.close();
	//---------------------------------------------------------
			 //���л�����ֽ�����ȡ����  �ȵ�һ���ֽ�����Ч,���õĻ�������СΪ100KB��
			 FileInputStream fis2 = new FileInputStream("D:/a1.mp4");
			 BufferedInputStream bis2 = new BufferedInputStream(fis2,100000);
			 FileOutputStream  fos2 = new FileOutputStream("a1.mp4");
			 BufferedOutputStream bos2 = new BufferedOutputStream(fos2,100000);
			 //�����ļ���Ӧ��������Դ�һЩ��10KB
			 byte input2[] = new byte[10000];
			 int count = 0;
			 long before = System.currentTimeMillis();
			 int l2 = 0;
			 while((l2=bis2.read(input2))!=-1){
				 bos2.write(input2,0,l2);
				 count++;
			 }
			 bos2.close();
			 fos2.close();
			 bis2.close();
			 fis2.close();
			 System.out.println(System.currentTimeMillis()-before+"ms");
			 System.out.println("��ȡ��:"+count+"��");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
