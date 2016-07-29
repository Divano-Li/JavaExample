
import java.io.*; 

public class FileTest1 { 

    public static void main(String[] args) 
		throws IOException 
		{ 

        File file=new File("."); 

        System.out.println(file.exists()); 

        //System.out.println(file.isDirectory()); 

        //System.out.println(file.getAbsolutePath()); 
		File file2 = new File("E:\\JavaF\\ClassF\\exam.txt");
		//file2.createNewFile();
		System.out.println(file2.exists());


    } 

}
