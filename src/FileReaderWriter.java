//filereader 和  FileWriter 专门操作文本的字符流

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		
			try {
				FileReader fr = new FileReader("test.txt");
				BufferedReader br = new BufferedReader(fr);
				
				FileWriter fw = new FileWriter("test3.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				String input = null;
				while((input = br.readLine())!=null){
					bw.write(input+"\n");
				}
				bw.flush();//很有必要
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		

	}

}
