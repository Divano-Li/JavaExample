import java.util.*;
public class LinkHashTest
{
	public static void main(String[] args)
	{
		LinkedHashMap<String,Integer> sc=new LinkedHashMap();
		sc.put("����",90);
		sc.put("��ѧ",80);
		sc.put("Ӣ��",70);
		//��һ�ֱ�������java8������forEach����
		sc.forEach((key,value)->System.out.println(key+"->"+value));
		System.out.println("**********************");
		//�ڶ��ַ�������foreachѭ������
		for (String a:sc.keySet() )
		{
				System.out.println(a+"->"+sc.get(a));
		}
		System.out.println("**********************");
		//�ڶ��ַ����ı���
		for (String a:sc.keySet() )
		{
			System.out.println(a+" ");
		}
		for (Object a:sc.values() )
		{
			System.out.println(a+" ");
		}
		System.out.println("**********************");
		//�����ַ�������Iterator�����˷����в�ͨ����Ϊ��Iterator��Collection�ĸ��ӿڣ�����������Collection�Ķ���
		//�������ǿ�����entrySet()��������Set���ϣ�Set����������Collection���ϣ�
		/*
		Iterator it=sc.iterator();//��ȡsc���϶�Ӧ�ĵ�������ע���Ƿ������ã���
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		Iterator it=sc.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+"->"+value);
		}
		System.out.println("**********************");
		
		//�����ַ�������foreach������ʹ��entry������
		for (Map.Entry<String,Integer> entry :sc.entrySet() )
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		System.out.println("**********************");
		for (Object a:sc.values() )
		{
			System.out.println(a);
		}
	}

}
