class animal
{
    	String name;
    	public void eat()
	{
        	System.out.println("I can eat");
    	}
}
class dog extends animal
{
    	public void display()
	{
        	System.out.println("My name is " + name);
    	}
}
public class Q28
{
    	public static void main(String args[])
  	{
        	dog labrador = new dog();
        	labrador.name = "spike";
        	labrador.display();
        	labrador.eat();
    	}
}