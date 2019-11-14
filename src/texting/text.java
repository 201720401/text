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
	{//随机数生成模块
		//创建集合容器对象
		List<Integer>list=new ArrayList<Integer>();
		Random r=new Random();
		//循环将得到的随机数进行判断，如果随机数不存在于集合中，则将随机数放入集合中，如果存在，则将随机数丢弃不做操作，进行下一次循环，直到集合长度等于nums
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
	{//计算算式
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
			{//判断和是否大于100
				if(i-j>0)
				{//判断差是否为负数
					System.out.println("No."+(x+1));
					System.out.print(""+i);
					System.out.print(""+array[k]);
					System.out.print(""+j);
					System.out.println("=");
					boolean isTrue=false;
					int answer=0,answerPeople=0;
					if(array[k]=='+')
					{//判断输入答案是否正确
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
						System.out.println("回答正确！");
					}
					else
					{
						System.out.println("回答错误！");
					}
					if(k==0)//生成正确答案
						System.out.println("正确答案："+(i-j));
					else
						System.out.println("答案正确："+(i+j));	
				}else x--;
			}else x--;		
		}
	}
}
