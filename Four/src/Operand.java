
public class Operand extends Figure{
	public void rule(){
		int t,al = 0;
		if(judge_2==1)
			al=4;
		    else if(judge_2==0)
			al=2;
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
else  if(t==3&&figure_2!=0)//���� 
	{
	result=figure_1/figure_2;
	s='/';
	}
}
}
