package day13;

public class ThisKeyword {
	int x,y ;// class variables/instance variable
	ThisKeyword(int a,int b)
	{
		x=a;
		y=b;
	}
	void setdata(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword(100, 200);
		th.display();
		

	}

}
