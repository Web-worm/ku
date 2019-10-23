import java.util.Scanner;
public class Num_Questions {
	 Scanner in=new Scanner(System.in);
	 static int  judge_1,judge_2,judge_3,judge_4,judge_5;
public void Judge(){
	while(true)
	{
    System.out.println("请输入您需要的题目数量（范围在10~100以内）：");
    judge_1=in.nextInt(); //  scanf("%d",&judge_1);
   if(judge_1>100||judge_1<10)
      System.out.println("\n输入错误，请重新输入\n");
   else break; 
}
while(true)
	{
	 System.out.println("是否需要加入乘除法(1:是 0:否):");
	 judge_2=in.nextInt();//scanf("%d",&judge_2);
if(judge_2!=1&&judge_2!=0)
	System.out.printf("\n输入错误，请重新输入\n");
   else break; 
} 
while(true)
	{
	System.out.println("请输入操作数数值的范围(如：10或100):");
	judge_3=in.nextInt();//scanf("%d",&judge_3); 
if(judge_3>1000||judge_3<=0)
	System.out. println("\n输入错误，请重新输入\n");
   else break; 
} 
while(true)
	{
	System.out.println("是否需要负数计算(1:是 0:否):");
	judge_4=in.nextInt();//scanf("%d",&judge_4); 
if(judge_4!=1&&judge_4!=0)
	System.out.println("\n输入错误，请重新输入\n\n");
   else break; 
} 
	while(true)
	{
		System.out.println("是否需要答案(1:是 0:否):");
		judge_5=in.nextInt();//scanf("%d",&judge_5); 
	if(judge_5!=1&&judge_5!=0)
		System.out.println("\n输入错误，请重新输入\n");
   else break; 
} 
	System.out.println("题目为：\n");
	}

}
