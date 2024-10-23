package day10;

public class Employee {
	// variable--class variables are anywhere
			int eid;
			String ename;
			String job;
			int sal;
			
//methods -local variable
			void display()
			{
				System.out.println(eid);
				System.out.println(ename);
				System.out.println(job);
				System.out.println(sal);		
			}

	public static void main(String[] args) {
		Employee emp1=new Employee();//object
		emp1.eid=101;
		emp1.ename="john";
		emp1.job="manager";
		emp1.sal=800000;
		emp1.display();
		
		Employee emp2=new Employee();//object
		emp2.eid=102;
		emp2.ename="john jr";
		emp2.job="manager sr";
		emp2.sal=900000;
		emp2.display();
		
	
	}

}
