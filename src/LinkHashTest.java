import java.util.*;
public class LinkHashTest
{
	public static void main(String[] args)
	{
		LinkedHashMap<String,Integer> sc=new LinkedHashMap();
		sc.put("语文",90);
		sc.put("数学",80);
		sc.put("英语",70);
		//第一种遍历方法java8新增的forEach方法
		sc.forEach((key,value)->System.out.println(key+"->"+value));
		System.out.println("**********************");
		//第二种方法利用foreach循环遍历
		for (String a:sc.keySet() )
		{
				System.out.println(a+"->"+sc.get(a));
		}
		System.out.println("**********************");
		//第二种方法的变形
		for (String a:sc.keySet() )
		{
			System.out.println(a+" ");
		}
		for (Object a:sc.values() )
		{
			System.out.println(a+" ");
		}
		System.out.println("**********************");
		//第三种方法利用Iterator——此方法行不通，因为是Iterator是Collection的父接口，必须依附于Collection的对象
		//所以我们可以用entrySet()方法返回Set集合，Set集合是属于Collection集合；
		/*
		Iterator it=sc.iterator();//获取sc集合对应的迭代器，注意是方法调用！！
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
		
		//第四种方法是在foreach方法中使用entry来遍历
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
