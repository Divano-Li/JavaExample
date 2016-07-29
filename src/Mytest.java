public class Mytest
{
	@Testable
		public static void m1()
		{}
	@Testable
		public static void m2()
		{
			throw new IllegalArgumentException("参数出错了");
		}
	@Testable
		public static void m3()
		{}
	@Testable
		public static void m4()
		{
			throw new RuntimeException("程序出现异常");
		}

} 

