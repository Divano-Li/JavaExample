import java.util.*;
public class ArrayDequeTest
{
	public static void main(String[] args)
	{	
		ArrayDeque test=new ArrayDeque();
		//当成栈来使用，常用的方法为：push(e);pop()出栈;peek()返回栈的第一个元素;
		test.push("疯狂java讲义");
		test.push("喜欢你");
		test.push("真的爱你");
		test.push("海阔天空");
		test.add("lemon tree");
		System.out.print(test);
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.getFirst());
		System.out.println(test.offerFirst("光辉岁月"));
		System.out.println(test);
		System.out.println(test.offerLast("viva la viva"));
		System.out.println(test);
		test.removeLast();
		System.out.println(test);
		//当成队列来使用常用的方法为：offer(e);poll()出队列;peek()获取队列的头部元素;
		ArrayDeque queue=new ArrayDeque();
		queue.offer("张文洁");
		queue.offer("潘婷婷");
		queue.offer("牟虹运");
		System.out.print(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.remove(0);
		System.out.print(queue);

	}
}
