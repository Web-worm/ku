import java.util.Scanner;
public class Num_Questions {
	 Scanner in=new Scanner(System.in);
	 static int  judge_1,judge_2,judge_3,judge_4,judge_5;
public void Judge(){
	while(true)
	{
    System.out.println("����������Ҫ����Ŀ��������Χ��10~100���ڣ���");
    judge_1=in.nextInt(); //  scanf("%d",&judge_1);
   if(judge_1>100||judge_1<10)
      System.out.println("\n�����������������\n");
   else break; 
}
while(true)
	{
	 System.out.println("�Ƿ���Ҫ����˳���(1:�� 0:��):");
	 judge_2=in.nextInt();//scanf("%d",&judge_2);
if(judge_2!=1&&judge_2!=0)
	System.out.printf("\n�����������������\n");
   else break; 
} 
while(true)
	{
	System.out.println("�������������ֵ�ķ�Χ(�磺10��100):");
	judge_3=in.nextInt();//scanf("%d",&judge_3); 
if(judge_3>1000||judge_3<=0)
	System.out. println("\n�����������������\n");
   else break; 
} 
while(true)
	{
	System.out.println("�Ƿ���Ҫ��������(1:�� 0:��):");
	judge_4=in.nextInt();//scanf("%d",&judge_4); 
if(judge_4!=1&&judge_4!=0)
	System.out.println("\n�����������������\n\n");
   else break; 
} 
	while(true)
	{
		System.out.println("�Ƿ���Ҫ��(1:�� 0:��):");
		judge_5=in.nextInt();//scanf("%d",&judge_5); 
	if(judge_5!=1&&judge_5!=0)
		System.out.println("\n�����������������\n");
   else break; 
} 
	System.out.println("��ĿΪ��\n");
	}

}
