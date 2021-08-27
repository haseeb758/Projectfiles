package OOPConcepts;

public class Employee {
	int empid;
	String empname;
	int salary;
	int dptno;
	
	/*Employee(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		dptno=dno;
	}*/
	/*void getvlaue(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		dptno=dno;
	}*/
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(dptno);
	}
	
	public static void main(String args[]) {
		// Defining class variables using class object
		/*Employee emp1=new Employee();
		emp1.empid=100;
		emp1.empname="Khan";
		emp1.salary=20000;
		emp1.dptno=10;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.empid=101;
		emp2.empname="Saan";
		emp2.salary=30000;
		emp2.dptno=20;
		emp2.display();*/
		
		// Defining class variables using class constructor 
		/*Employee emp1=new Employee(104,"Kiran",40000,30);
		Employee emp2=new Employee(105,"Kumar",67000,70);
		emp1.display();
		emp2.display();*/
		
		// Defining class variables using class method
		/*Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.getvlaue(110,"John", 70000, 90);
		emp2.getvlaue(120,"Harry",50000, 40);
		emp1.display();
		emp2.display();*/
	
	
	}}
