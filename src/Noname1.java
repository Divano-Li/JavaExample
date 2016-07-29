//首先定义一个接口
public @interface Test
{

}
//使用@Test类修饰类定义
@Test 
public class Mysclass
{
	//使用@Test Annotation修饰方法
	@Test
	public void info()
	{}
}
//定义带两个成员变量的Annotation
public @interface Mytag
{
	//Annotation 中的成员变量以无形参的方法的形式来定义
	String name();
	int age();
}
//一旦使用带成员变量的Annotation时，需要为成员变量赋值
public class Test1
{
	@Mytag(name="x",age=6)
	public void info()
	{
		
	}
}
//也可以在定义Annotation的成员变量时为其指定初始值（默认值），制定成员变量的初始值使用
//default 关键字。
public @interface Mytag
{
	String name() default "x";
	int age() default 32;
}
//成员变量指定了默认值，使用该Annotation时则可以不为这些成员变量指定值，直接使用默认值；
public class Test2
{
	@Mytag
	public void info()
	{}
}
10.3.2
提取Annotation信息
当我们使用Annotation修饰了类、方法、成员变量等成员之后，这些Annotation信息不会自己生效
我们必须提供相应的工具来提取并处理Annotation信息（但我现在还不知道这些Annotation信息的用处）


