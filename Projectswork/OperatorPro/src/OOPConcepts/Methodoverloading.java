package OOPConcepts;

public class Methodoverloading {
	
	int a;
	int b;
	//First Method without parameters
	void sum ()
	{
		a=10;
		b=30;
		System.out.println(a+b);
	}
	// Second Method with parameters
	void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	//Third Method with parameters but different data type
	void sum(int x,double y)
	{
		System.out.println(x+y);
	}
	//Fourth Method with different number of parameters
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	public static void main(String args[]) {
		Methodoverloading mo=new Methodoverloading();
		mo.sum();
		mo.sum(100,300);
		mo.sum(20,40.5);
		mo.sum(60,50,70);

	}

}
