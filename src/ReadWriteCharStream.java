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
				//将字节流转换成字符流
				InputStreamReader isr = new InputStreamReader(fis);
				char input[] = new char[100];
				int l =0;
				while((l=isr.read(input))!=-1){
					System.out.println(new String(input,0,l));
				}
				isr.close();
				fis.close();
		//----------------------------------------------------------
			//通过字符流实现文件的copy
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
			//通过缓冲字符流实现文件的copy
				//上面的字符流有一定的局限性：字符输入流isr1 read 方法不能读取字符串，只能读取字符数组
								// 字符输出流 osw1 Write 方法不能写一行字符串后自动换行。
				FileInputStream fis2 = new FileInputStream("test.txt");
				FileOutputStream fos2 = new FileOutputStream("test2.txt");
				InputStreamReader isr2 = new InputStreamReader(fis2);
				OutputStreamWriter osw2 = new OutputStreamWriter(fos2);
				BufferedReader br2 = new BufferedReader(isr2);
				//BufferedWriter bw2 = new BufferedWriter(osw2);
				PrintWriter pw2 = new PrintWriter(osw2,true);
				String input2;
				//读取一行，但换行符会丢失,所以用Printwriter类的print方法
				while((input2 =br2.readLine())!=null){
					//bw2.write(input2);
					//osw2的write方法和bw2的write方法是一样的，但是bw2有缓冲区，当缓冲区满了后才会写入，会延长硬盘使用寿命
					pw2.println(input2);
				}
				//bw2.close();
				//pw2.flush();//将当前所有缓冲区的内容强制输出，保证文件的完整。 已在定义时true了
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
