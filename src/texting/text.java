package texting;
import java.util.*;
public class text 
{

	public static void main(String[] args) 
	{
		Suanshi();
	}
	public static List<Integer>
	getRandomNumList(int nums,int star,int end)
	{//���������ģ��
		//����������������
		List<Integer>list=new ArrayList<Integer>();
		Random r=new Random();
		//ѭ�����õ�������������жϣ����������������ڼ����У�����������뼯���У�������ڣ����������������������������һ��ѭ����ֱ�����ϳ��ȵ���nums
		while(list.size()!=nums)
		{
			int num=r.nextInt(end-star)+star;
			if(!list.contains(num))
			{
				list.add(num);
			}
		}
		return list;
	}
	private static void Suanshi()
	{//������ʽ
		List<Integer>list1=getRandomNumList(50,0,100);
		Random random1=new Random();
		Random random2=new Random();
		char array[]=new char[]{'-','+'};
		for(int x=0;x<50;x++)
		{
			int i=list1.get(x);
			int j=random1.nextInt(100);
			int k=random2.nextInt(2);
			if(i+j<100)
			{//�жϺ��Ƿ����100
				if(i-j>0)
				{//�жϲ��Ƿ�Ϊ����
					System.out.println("No."+(x+1));
					System.out.print(""+i);
					System.out.print(""+array[k]);
					System.out.print(""+j);
					System.out.println("=");
					boolean isTrue=false;
					int answer=0,answerPeople=0;
					if(array[k]=='+')
					{//�ж�������Ƿ���ȷ
						answer=i+j;
						
					}
					else
					{
						answer=i-j;
					}
					Scanner s=new Scanner(System.in);
					answerPeople=s.nextInt();
					if(answer==answerPeople)
					{
						System.out.println("�ش���ȷ��");
					}
					else
					{
						System.out.println("�ش����");
					}
					if(k==0)//������ȷ��
						System.out.println("��ȷ�𰸣�"+(i-j));
					else
						System.out.println("����ȷ��"+(i+j));	
				}else x--;
			}else x--;		
		}
	}
}
