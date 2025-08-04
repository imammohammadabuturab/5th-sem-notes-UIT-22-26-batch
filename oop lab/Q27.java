class Count
{
  	static int a=0;
    	public void increase()
    	{
        	a++;
        	System.out.println("a is"+a);
    	}
}
public class Q27
{
    	public static void main(String[] args) 
	{
        	Count c1= new Count();
        	c1.increase();
        	c1.increase();
    	}
}