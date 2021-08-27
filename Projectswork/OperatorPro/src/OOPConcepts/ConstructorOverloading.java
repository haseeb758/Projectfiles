package OOPConcepts;

public class ConstructorOverloading {
	int a;
	int b;
	double c;
	//First Constructor without parameters
	ConstructorOverloading()
	{
		a=10;
		b=30;
		c=20.15;
	}
	// Second Constructor with parameters along with this keyword
	ConstructorOverloading(int a,int b)
	{
		this.a=a;
		this.b=b;	
	}
	//Third Constructor with parameters but different data type
	ConstructorOverloading(int x,double z)
	{
		a=x;
		c=z;
	}
	//Fourth Constructor with different number of parameters along with this keyword
	ConstructorOverloading(int a,int b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//Fifth Constructor with different order of parameters
	ConstructorOverloading(int x,double y,int z)
	{
		a=x;
		b=z;
		c=y;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

  public static void main(String[] args) {
		
	 ConstructorOverloading co=new ConstructorOverloading();
	 co.display();
	 ConstructorOverloading co1=new ConstructorOverloading(40,60);
	 co1.display();
	 ConstructorOverloading co2=new ConstructorOverloading(70,15.5);
	 co2.display();
	 ConstructorOverloading co3=new ConstructorOverloading(11,12,90.8);
	 co3.display();
	 ConstructorOverloading co4=new ConstructorOverloading(17,60.89,54);
	 co4.display();
	}

}
