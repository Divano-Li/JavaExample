//���������(a>b)?a:b��������������Ļ������ӡ� 
	public class Prog5
	{  
		public static void main(String[] args)
	{  
			int n = -1;   
			try
			{    
				n = Integer.parseInt(args[0]);  
			}
			catch(ArrayIndexOutOfBoundsException e) //������Ĳ��������������о��ǲ�����ʱ�������ᷢ������Խ���쳣
				{ 
				System.out.println("������ɼ�");  
				return; //��ʱӦ�����Ƴ�main()���������˳�����
				}   
				grade(n); 
	} 
 //�ɼ��ȼ����� 
 private static void grade(int n)
	 {   
	 if(n>100 || n<0) 
		System.out.println("������Ч");   
	 else{ 
		String str = (n>=90)?"�֣�����A��":((n>60)?"�֣�����B��":"�֣�����C��");    
		System.out.println(n+str);   
		} 
	} 
} 