interface printinteger
	{
    		void printint(int a);
	}
interface maximum extends printinteger
	{   
    		void max(int a, int b);
	}
public class Q35 implements maximum
	{
    		public void printint(int a)
			{
        			System.out.print(a);
    			}
   		public void max(int a, int b){
        	if(a>b)
			{
            			printint(a);
        		}
        	else
			{
            			printint(b);
        		}
    	}
public static void main(String args[])
	{
        	int a = 10;
        	int b = 20;
        	Q35 p = new Q35();
        	System.out.print("the numbers are ");
        	p.printint(a);
        	System.out.print(" and ");
        	p.printint(b);
        	System.out.print("\nthe greater number is ");
        	p.max(a,b);
    	}
}