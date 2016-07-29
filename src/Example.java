public class Example<E> 
{	public E b;
	//当创建带泛型声明的自定义类，为该类定义构造器时，构造器还是原来的类名，不用增加泛型声明
	public Example(E b)
	{	
		this.b=b;
	}
	public Example(){}//构造器重载
	public E method1()
	{
		return this.b;
	}
	//定义了一个含有泛型声明的Example类；
	public String a;
	public static void main(String[] args)
	{
		/*Example<String> sc=new Example<>();
		sc.a="123";
		System.out.print(sc.a);
		sc.a=sc.method(sc.a);
		System.out.print(sc.a);*/
		
	//由于传给类型形参T的类型为String，所以构造器参数只能是String
		Example<String> sc=new Example<>("小小");
		System.out.print(sc.method1());
	//由于传给类型参数T的类型为int,所以构造器参数只能是int
		Example<Integer> sc1=new Example<>(123);
		System.out.print(sc1.method1());
		System.out.println("************");
		
		
	}
	
}
	
