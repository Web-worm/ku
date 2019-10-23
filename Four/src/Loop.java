
public class Loop extends Figure{
	Operand o=new Operand();
	Result r=new Result();
	char fg_1[]=new char[1000],fg_2[]=new char[1000],law[]=new char[1000];
	
	void begin(){
		for(i=0;i<judge_1;i++){
			 o.create();
			 o.rule();
				if(result>100||result<-100)//判断结果是否在100范围内 
				{ 
				  i--; 
				  continue;
				} 
				int t_1=0;
			    fg_1[i]=(char) figure_1;
		        law[i]=s;
		        fg_2[i]=(char) figure_2;
		        for(int a=i;a>0;a--)
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
				r.result();
			}
	}
}
