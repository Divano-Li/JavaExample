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
//创建RandomAccessFile 类读写文件。其作用可以利用多线程进行读取和下载
public class RandonAccessFile {
	static File file = new File("test4.txt");
	public static void main(String[] args) {
		/*//写文件
		if(file.exists())
			file.delete();
		//每次执行前都会判断文件是否存在，先删除存在的文件，因为RandomAccessFile类会自动创建file（如果file不存在）
		new WriteFile(file, 1).start();
		new WriteFile(file, 2).start();
		new WriteFile(file, 3).start();
		new WriteFile(file, 4).start();
		new WriteFile(file, 5).start();*/
	
	//-------------------------------------------
		//读文件,此时注释上面的写文件语句
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
