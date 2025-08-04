public class Q25 
{
    	public static void main(String[] args) 
	{
        	ModifierExample example = new ModifierExample();
		System.out.println("Public Variable: " + example.publicVar);
		System.out.println("Protected Variable: " + example.getProtectedVar());
   		System.out.println("Default Variable: " + example.defaultVar);
 		System.out.println("Private Variable: " + example.getPrivateVar());
    	}
}

class ModifierExample 
{
    	public int publicVar = 10;        
    	protected int protectedVar = 20; 
    	int defaultVar = 30;              
   	private int privateVar = 40;
	public int getPrivateVar() 
	{
        	return privateVar;
  	}
	protected int getProtectedVar() 
	{
        return protectedVar;
    	}
}
