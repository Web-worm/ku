public class Result extends Operand{
	void result(){
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