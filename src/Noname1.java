//���ȶ���һ���ӿ�
public @interface Test
{

}
//ʹ��@Test�������ඨ��
@Test 
public class Mysclass
{
	//ʹ��@Test Annotation���η���
	@Test
	public void info()
	{}
}
//�����������Ա������Annotation
public @interface Mytag
{
	//Annotation �еĳ�Ա���������βεķ�������ʽ������
	String name();
	int age();
}
//һ��ʹ�ô���Ա������Annotationʱ����ҪΪ��Ա������ֵ
public class Test1
{
	@Mytag(name="x",age=6)
	public void info()
	{
		
	}
}
//Ҳ�����ڶ���Annotation�ĳ�Ա����ʱΪ��ָ����ʼֵ��Ĭ��ֵ�����ƶ���Ա�����ĳ�ʼֵʹ��
//default �ؼ��֡�
public @interface Mytag
{
	String name() default "x";
	int age() default 32;
}
//��Ա����ָ����Ĭ��ֵ��ʹ�ø�Annotationʱ����Բ�Ϊ��Щ��Ա����ָ��ֵ��ֱ��ʹ��Ĭ��ֵ��
public class Test2
{
	@Mytag
	public void info()
	{}
}
10.3.2
��ȡAnnotation��Ϣ
������ʹ��Annotation�������ࡢ��������Ա�����ȳ�Ա֮����ЩAnnotation��Ϣ�����Լ���Ч
���Ǳ����ṩ��Ӧ�Ĺ�������ȡ������Annotation��Ϣ���������ڻ���֪����ЩAnnotation��Ϣ���ô���


