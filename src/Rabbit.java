import java.util.*;
public class Rabbit{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入你想看多少月后的兔子数量：");
	int n=sc.nextInt();
	System.out.println(new Rabbit().method(n));//此处调用实例方法还需创建实例，若
												//在method方法前加上static，就可以直接
												//写method(n)了；
}
	public long method(int a){
		if(a==1)
			return 1;
		if(a==2)
			return 1;
		return method(a-1)+method(a-2);//若此处加上if（a!=1&a!=2）编译器就会提示错误：
										//缺少返回，虽然逻辑没有错误
	}
}

