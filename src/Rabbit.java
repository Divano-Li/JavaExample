import java.util.*;
public class Rabbit{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("���������뿴�����º������������");
	int n=sc.nextInt();
	System.out.println(new Rabbit().method(n));//�˴�����ʵ���������贴��ʵ������
												//��method����ǰ����static���Ϳ���ֱ��
												//дmethod(n)�ˣ�
}
	public long method(int a){
		if(a==1)
			return 1;
		if(a==2)
			return 1;
		return method(a-1)+method(a-2);//���˴�����if��a!=1&a!=2���������ͻ���ʾ����
										//ȱ�ٷ��أ���Ȼ�߼�û�д���
	}
}

