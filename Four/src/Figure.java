
public class Figure extends Num_Questions{//���������
	static int figure_1 = 0,figure_2 = 0,result = 0;
	static char s=' ';
	static int i=0;
	void create(){
	if(judge_4==0){			
	    figure_1=(int)(Math.random()*judge_3+1);//figure_1=rand()%judge_3+1;//�������������1 
	    figure_2=(int)(Math.random()*judge_3+1);//figure_2=rand()%judge_3+1;//�������������2 
		}
	else if(judge_4==1){
		figure_1=judge_3/2-(int)(Math.random()*judge_3+1);//figure_1=rand()%(2*judge_3+1)-judge_3;//�����������������1 
		figure_2=judge_3/2-(int)(Math.random()*judge_3+1);//figure_2=rand()%(2*judge_3+1)-judge_3;//�����������������2 
	} 
	}
}
