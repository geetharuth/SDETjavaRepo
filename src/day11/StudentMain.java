package day11;

public class StudentMain {

	public static void main(String[] args) {
	//1)   using object reference variables
		
		
		//Student stu=new Student();
        
		/*stu.sid=101;
		stu.sname="amma";
		stu.grad='a';
	stu.printStudentdata();*/
		
	//2)  using method 
		//stu.setstudentData(1012,"kamal", 'a');
		
		//3)  using constructor
		Student stu=new Student(1013,"kamalhasan", 'b');
		stu.printStudentdata();
	}
}
