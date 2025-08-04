class A
{
    	public void m()
	{
        	System.out.println("inside a");
    	}
}
class B extends A
	{
    	public void makesound()
	{
        	System.out.println("inside b");
    	}
}
class C extends A
{
    	public void m()
	{
        	System.out.println("inside c");
    	}
}
public class Q31
{
    	public static void main(String args[])
    	{
        	A a = new A();
        	B b = new B();
        	C c = new C();
        	A ref;
        	ref = a;
        	ref.m();
        	ref = b;
        	ref.m();
        	ref = c;
        	ref.m(); 
    	}
}