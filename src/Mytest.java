public class Mytest
{
	@Testable
		public static void m1()
		{}
	@Testable
		public static void m2()
		{
			throw new IllegalArgumentException("����������");
		}
	@Testable
		public static void m3()
		{}
	@Testable
		public static void m4()
		{
			throw new RuntimeException("��������쳣");
		}

} 

