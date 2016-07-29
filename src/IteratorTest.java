import java.util.*;
public class IteratorTest
{
	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add("nihao");
		books.add("shijie");
		Iterator it=books.iterator();
		while(it.hasNext())
		{
			String book=(String)it.next();
			System.out.println(book);
			if(book.equals("nihao"))
			{
				books.remove(book);
			}

		}
		System.out.println(books);
	}
}