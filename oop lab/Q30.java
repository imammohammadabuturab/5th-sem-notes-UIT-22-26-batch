class animal
{
    	public void makesound()
	{
        	System.out.println("the animal makes a sound");
    	}
}
class dog extends animal
{
    	@Override
    	public void makesound()
	{
        	System.out.println("the dog barks");
    	}
}
public class Q30
{
    	public static void main(String args[])
    	{
        	animal a = new animal();
        	dog d = new dog();
        	a.makesound();
        	d.makesound();
    	}
}