package day11;

public class ConstructorDemo {
	int x,y;
	ConstructorDemo()//default constructor
	{
		x=100;
		y=200;
	}
ConstructorDemo(int a,int b)
{
	x=a;
	y=b;
}
void sum()
{
	System.out.println(x+y);
}
	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo();//invoke default constructor
		ConstructorDemo cd=new ConstructorDemo(20, 30);//parameterized constructor
		cd.sum();
	}

}
