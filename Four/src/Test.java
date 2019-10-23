public class Test {
	public static void main(String[] args) {
		Num_Questions Nq=new Num_Questions();
		 Loop l=new Loop();
		Nq.Judge();
		l.begin();
		//System.out.println("题目为：\n");
	}

}
/*
*public class Four {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
		int a;
	    char fg_1[]=new char[1000],fg_2[]=new char[1000],law[]=new char[1000];
		int figure_1 = 0,figure_2 = 0,t,result = 0,al = 0;
		char s = 0;
		int  judge_1,judge_2,judge_3,judge_4,judge_5;
		//FILE*fp;
	    //fp=fopen("D:\\result.txt","w+");//创建文件；
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
		if(judge_2==1)
		al=4;
	    else if(judge_2==0)
		al=2;
	//	srand(time(0));
		for(int i=0;i<judge_1;i++){
			if(judge_4==0){			
		    figure_1=(int)(Math.random()*judge_3+1);//figure_1=rand()%judge_3+1;//正数随机操作数1 
		    figure_2=(int)(Math.random()*judge_3+1);//figure_2=rand()%judge_3+1;//正数随机操作数2 
			}
		else if(judge_4==1){
			figure_1=judge_3/2-(int)(Math.random()*judge_3+1);//figure_1=rand()%(2*judge_3+1)-judge_3;//包含负数随机操作数1 
			figure_2=judge_3/2-(int)(Math.random()*judge_3+1);//figure_2=rand()%(2*judge_3+1)-judge_3;//包含负数随机操作数2 
		} 
	     	t=(int)(Math.random()*4%al);//随机计算 
			if(t==0)//加法 
			{
			result=figure_1+figure_2;
			s='+';
			}
		else if(t==1)//减法 
			{
			result=figure_1-figure_2;
			s='-';
			}
		else if(t==2)//乘法 
			{
			result=figure_1*figure_2;
			s='*';
			}
		else  if(t==3)//除法 
			{
			result=figure_1/figure_2;
			s='/';
			}
			if(result>100||result<-100)//判断结果是否在100范围内 
			{ 
			  i--; 
			  continue;
			} 
			int t_1=0;
		    fg_1[i]=(char) figure_1;
	        law[i]=s;
	        fg_2[i]=(char) figure_2;
	        for(a=i;a>0;a--)
	        {
	        	if((fg_1[i]==fg_1[a-1])&&(law[i]==law[a-1])&&(fg_2[i]==fg_2[a-1]))
			   {
		          t_1=1;	
		        } 	 
			}  
			if(t_1==1)//判断结果为重复，删除此题 
			{ 
			  i--; 
			  continue;
			} 
			if(judge_5==1)//判断是否需要答案 
				{
				if(figure_2<0)//第二个数是负数加括号 
				{ 
					System.out.printf("第%d题:%d%c(%d)=%d\n",i+1,figure_1,s,figure_2,result); //System.out.printf("第%d题:%d%c(%d)=%d\n",i+1,figure_1,s,figure_2,result); 
	    	    //fprintf(fp,"第%d题:%d%c(%d)=%d\n",i+1,figure_1,s,figure_2,result);
				}
			   else
		    	{
				   System.out.printf("第%d题:%d%c%d=%d\n",i+1,figure_1,s,figure_2,result);
		    	//fprintf(fp,"第%d题:%d%c%d=%d\n",i+1,figure_1,s,figure_2,result);
		    	}
			}
			else
			{
			if(figure_2<0){
				System.out.printf("第%d题:%d%c(%d)=\n",i+1,figure_1,s,figure_2); 
		    	//fprintf(fp,"第%d题:%d%c(%d)=\n",i+1,figure_1,s,figure_2);
			} 	
			   else
			   {
				   System.out.printf("第%d题:%d%c%d=\n",i+1,figure_1,s,figure_2);
				//fprintf(fp,"第%d题:%d%c%d=\n",i+1,figure_1,s,figure_2);	
	   		}
		    	
			}	
		}
	}

}*/
