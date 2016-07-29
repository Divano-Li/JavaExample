import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

class WriteFile extends Thread{
	File file;
	int block;
	int L=100;
	/**
	 * 
	 * 1	   2      3       4      5
	 * |-------|------|-------|------|
	 * 
	 * @param f
	 * @param b
	 */
	public WriteFile(File f, int b){
		this.file = f;
		this.block = b;
	}
	@Override
	public void run(){
		
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			raf.seek((block-1)*L);
			raf.writeBytes("This is block"+block);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
//-------------------------------------------------------
//����RandomAccessFile ���д�ļ��������ÿ������ö��߳̽��ж�ȡ������
public class RandonAccessFile {
	static File file = new File("test4.txt");
	public static void main(String[] args) {
		/*//д�ļ�
		if(file.exists())
			file.delete();
		//ÿ��ִ��ǰ�����ж��ļ��Ƿ���ڣ���ɾ�����ڵ��ļ�����ΪRandomAccessFile����Զ�����file�����file�����ڣ�
		new WriteFile(file, 1).start();
		new WriteFile(file, 2).start();
		new WriteFile(file, 3).start();
		new WriteFile(file, 4).start();
		new WriteFile(file, 5).start();*/
	
	//-------------------------------------------
		//���ļ�,��ʱע�������д�ļ����
		try {
			RandomAccessFile raf1 = new RandomAccessFile(file, "r");
			raf1.seek(300);
			byte[] str = new byte[20];
			raf1.read(str);
			String in = new String(str);
			System.out.println(in);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
