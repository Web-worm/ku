public class Result extends Operand{
	void result(){
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