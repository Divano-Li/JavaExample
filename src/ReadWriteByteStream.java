import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//java IO 简介
//IO流 ：读取设备上的数据，硬盘文件、内存、键盘、网络..
//IO流分类：输入流、输出流；字节流、字符流
//字节流：可以处理所有类型的数据，如MP3、图片、文字、视频。读到一个字节就返回一个字节，java中对应的类都以“Stream”结尾
//字符流：仅能够处理纯文本数据，如txt文本等。在读取时，读到一个或多个字节，先查找指定的编码表、然后将查到的字符返回。对应的类都是以“Reader”“Writer”结尾

public class ReadWriteByteStream {

	public static void main(String[] args) {
		try {
			//读字节流文件
			FileInputStream fis  = new FileInputStream("test.txt");
			byte[] input = new byte[20];
			fis.read(input);
			//目标是文本文档（字节流），将读到的字节转换成字符串输出出来
			String inputString = new String(input);
			System.out.println(inputString);
			fis.close();
	//---------------------------------------------------------
			//写入字节流文件
			FileOutputStream fos = new FileOutputStream("test1.txt");
			String outString = "写入数据";
			//将字符串转换成字节数组再写入
			byte output[] = outString.getBytes();
			fos.write(output);
			fos.close();
	//---------------------------------------------------------
			//通过字节流copy文件
			FileInputStream fis1 = new FileInputStream("test.txt");
			FileOutputStream fos1 = new FileOutputStream("test1.txt");
			 byte input1[] = new byte[50];
			 //首先读入50个字节到input1数组 ，再将input1数组中的内容写到b.jpg 中
			 int l1 = 0;//防止后面copy的时候多了些字符
			 while ((l1=fis1.read(input1))!=-1){
				 fos1.write(input1,0,l1);
			 }
			 fis1.close();
			 fos1.close();
	//---------------------------------------------------------
			 //带有缓冲的字节流读取数据  比单一的字节流高效,设置的缓冲区大小为100KB，
			 FileInputStream fis2 = new FileInputStream("D:/a1.mp4");
			 BufferedInputStream bis2 = new BufferedInputStream(fis2,100000);
			 FileOutputStream  fos2 = new FileOutputStream("a1.mp4");
			 BufferedOutputStream bos2 = new BufferedOutputStream(fos2,100000);
			 //大型文件对应的数组可以大一些，10KB
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
			 System.out.println("读取了:"+count+"次");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
