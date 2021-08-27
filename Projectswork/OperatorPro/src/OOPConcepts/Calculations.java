package OOPConcepts;


public class Calculations {
	
	int a;
	int b;
// Different Methods inside the class
// First Method that is not taking parameters & not returning value
	/*void sum()
	
	{
	   System.out.println(a+b);
	
	}*/
	
// Second Method is taking parameters & not returning value
	/*void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	
// Third Method is taking parameters & returning value
	/*int sum (int i,int j)
	{
		a=i;
		b=j;
		return (a+b);
		
	}*/
// Fourth Method is not taking parameters but returning value
	/*int sum ()
		{
			
			return (a+b);
			
		}*/
	
	
	public static void main(String args[]) {
		
		// First Method
		/*Calculations cal=new Calculations();
		cal.a=10;
		cal.b=30;
		cal.sum();*/
		
		// Second Method
		/*Calculations cal1=new Calculations();
		cal1.sum(20,50);
		Calculations cal2=new Calculations();
		cal2.sum(30,70);*/
		
		// Third Method
		/*Calculations cal3=new Calculations();
		int r=cal3.sum(60,60);
		System.out.println(r);*/
		
		//Fourth Method
		/*Calculations cal4=new Calculations();
		cal4.a=50;
		cal4.b=60;
		int s=cal4.sum();
		System.out.println(s);*/
		
	}

}
