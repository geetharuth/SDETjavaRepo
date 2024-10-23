package day12;

public class AdderMain {

	public static void main(String[] args) {
		//create object
		Adder addobj=new Adder();
		addobj.sum(100,200);//1)
		addobj.sum(10.5,20);
		addobj.sum(10, 15.5);
		addobj.sum(10,20,30);
	}

}
