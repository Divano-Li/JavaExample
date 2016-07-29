//程序分析：(a>b)?a:b这是条件运算符的基本例子。 
	public class Prog5
	{  
		public static void main(String[] args)
	{  
			int n = -1;   
			try
			{    
				n = Integer.parseInt(args[0]);  
			}
			catch(ArrayIndexOutOfBoundsException e) //当输入的参数不够（此题中就是不输入时），将会发生数组越界异常
				{ 
				System.out.println("请输入成绩");  
				return; //此时应该是推出main()方法，即退出程序；
				}   
				grade(n); 
	} 
 //成绩等级计算 
 private static void grade(int n)
	 {   
	 if(n>100 || n<0) 
		System.out.println("输入无效");   
	 else{ 
		String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");    
		System.out.println(n+str);   
		} 
	} 
} 