
public class Operand extends Figure{
	public void rule(){
		int t,al = 0;
		if(judge_2==1)
			al=4;
		    else if(judge_2==0)
			al=2;
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
else  if(t==3&&figure_2!=0)//除法 
	{
	result=figure_1/figure_2;
	s='/';
	}
}
}
