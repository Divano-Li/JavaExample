/*return是方法级的返回,在方法中遇到return就要返回出方法体，
 1，只有方法有返回值或者需要中途中断的时候才会用return。
 2，只有执行到return才会返回。
 假如
 int a=1
 if(a==2){
     return;
 }
 是不会返回的，会继续向下执行。
 3，如果方法有返回值，那么编译器会检查你的判断条件，如果发现有哪个if分支没有return，则会报错。*/			
/*public class returnexample
{
	public static void main(String[] args)
	{
		returnexample a=new returnexample();
		a.method();
	}
	public void method()
	{	int i=0;
		for (i=0;i<5 ;i++ )
		{
             if (i>2)
			{
			System.out.println(i);
			continue;//输出3 4 5 ；return：输出3；break：输出3 3
			}
		}
		System.out.println(i);
		
	}
}*/
//上述程序较繁琐，可以改为如下
public class returnexample
{
	public static void main(String[] args)
	{	
		int i=0;
		for (i=0;i<5 ;i++ )
		{
			if (i>2)
			{
				System.out.println(i);
				break;//输出3 4 5 ；return：输出3；break：输出3 3
			}
		}
		System.out.println(i);
	}
}
