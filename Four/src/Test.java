public class Test {
	public static void main(String[] args) {
		Num_Questions Nq=new Num_Questions();
		 Loop l=new Loop();
		Nq.Judge();
		l.begin();
		//System.out.println("��ĿΪ��\n");
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
	    //fp=fopen("D:\\result.txt","w+");//�����ļ���
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
		if(judge_2==1)
		al=4;
	    else if(judge_2==0)
		al=2;
	//	srand(time(0));
		for(int i=0;i<judge_1;i++){
			if(judge_4==0){			
		    figure_1=(int)(Math.random()*judge_3+1);//figure_1=rand()%judge_3+1;//�������������1 
		    figure_2=(int)(Math.random()*judge_3+1);//figure_2=rand()%judge_3+1;//�������������2 
			}
		else if(judge_4==1){
			figure_1=judge_3/2-(int)(Math.random()*judge_3+1);//figure_1=rand()%(2*judge_3+1)-judge_3;//�����������������1 
			figure_2=judge_3/2-(int)(Math.random()*judge_3+1);//figure_2=rand()%(2*judge_3+1)-judge_3;//�����������������2 
		} 
	     	t=(int)(Math.random()*4%al);//������� 
			if(t==0)//�ӷ� 
			{
			result=figure_1+figure_2;
			s='+';
			}
		else if(t==1)//���� 
			{
			result=figure_1-figure_2;
			s='-';
			}
		else if(t==2)//�˷� 
			{
			result=figure_1*figure_2;
			s='*';
			}
		else  if(t==3)//���� 
			{
			result=figure_1/figure_2;
			s='/';
			}
			if(result>100||result<-100)//�жϽ���Ƿ���100��Χ�� 
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
			if(t_1==1)//�жϽ��Ϊ�ظ���ɾ������ 
			{ 
			  i--; 
			  continue;
			} 
			if(judge_5==1)//�ж��Ƿ���Ҫ�� 
				{
				if(figure_2<0)//�ڶ������Ǹ��������� 
				{ 
					System.out.printf("��%d��:%d%c(%d)=%d\n",i+1,figure_1,s,figure_2,result); //System.out.printf("��%d��:%d%c(%d)=%d\n",i+1,figure_1,s,figure_2,result); 
	    	    //fprintf(fp,"��%d��:%d%c(%d)=%d\n",i+1,figure_1,s,figure_2,result);
				}
			   else
		    	{
				   System.out.printf("��%d��:%d%c%d=%d\n",i+1,figure_1,s,figure_2,result);
		    	//fprintf(fp,"��%d��:%d%c%d=%d\n",i+1,figure_1,s,figure_2,result);
		    	}
			}
			else
			{
			if(figure_2<0){
				System.out.printf("��%d��:%d%c(%d)=\n",i+1,figure_1,s,figure_2); 
		    	//fprintf(fp,"��%d��:%d%c(%d)=\n",i+1,figure_1,s,figure_2);
			} 	
			   else
			   {
				   System.out.printf("��%d��:%d%c%d=\n",i+1,figure_1,s,figure_2);
				//fprintf(fp,"��%d��:%d%c%d=\n",i+1,figure_1,s,figure_2);	
	   		}
		    	
			}	
		}
	}

}*/
