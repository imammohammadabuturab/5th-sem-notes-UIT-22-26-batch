interface printinteger
{
    	void printint(int a);
}
public class Q34 implements printinteger
{
    	public void printint(int a)
	{
        	System.out.println(a);
    	}
    	public static void main(String args[])
    	{
        	Q34 p = new Q34();
        	p.printint(10);
    	}
}