public class Example<E> 
{	public E b;
	//�������������������Զ����࣬Ϊ���ඨ�幹����ʱ������������ԭ�����������������ӷ�������
	public Example(E b)
	{	
		this.b=b;
	}
	public Example(){}//����������
	public E method1()
	{
		return this.b;
	}
	//������һ�����з���������Example�ࣻ
	public String a;
	public static void main(String[] args)
	{
		/*Example<String> sc=new Example<>();
		sc.a="123";
		System.out.print(sc.a);
		sc.a=sc.method(sc.a);
		System.out.print(sc.a);*/
		
	//���ڴ��������β�T������ΪString�����Թ���������ֻ����String
		Example<String> sc=new Example<>("СС");
		System.out.print(sc.method1());
	//���ڴ������Ͳ���T������Ϊint,���Թ���������ֻ����int
		Example<Integer> sc1=new Example<>(123);
		System.out.print(sc1.method1());
		System.out.println("************");
		
		
	}
	
}
	
