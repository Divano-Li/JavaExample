import java.util.*;
public class ArrayDequeTest
{
	public static void main(String[] args)
	{	
		ArrayDeque test=new ArrayDeque();
		//����ջ��ʹ�ã����õķ���Ϊ��push(e);pop()��ջ;peek()����ջ�ĵ�һ��Ԫ��;
		test.push("���java����");
		test.push("ϲ����");
		test.push("��İ���");
		test.push("�������");
		test.add("lemon tree");
		System.out.print(test);
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.getFirst());
		System.out.println(test.offerFirst("�������"));
		System.out.println(test);
		System.out.println(test.offerLast("viva la viva"));
		System.out.println(test);
		test.removeLast();
		System.out.println(test);
		//���ɶ�����ʹ�ó��õķ���Ϊ��offer(e);poll()������;peek()��ȡ���е�ͷ��Ԫ��;
		ArrayDeque queue=new ArrayDeque();
		queue.offer("���Ľ�");
		queue.offer("������");
		queue.offer("Ĳ����");
		System.out.print(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.remove(0);
		System.out.print(queue);

	}
}
