class animal
{
    	String colour = "white";
    	public void eat()
	{
 	      	System.out.println("i can eat");
    	}
}
class dog extends animal
{
    	String colour = "black";
    	public void printcolour()
	{
        	System.out.println(colour);
        	System.out.println(super.colour);
    	}
}
public class Q29
{
    	public static void main(String args[])
    	{
        	dog d = new dog();
        	d.printcolour();
    	}
}