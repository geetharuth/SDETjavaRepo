package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		// 1)
		Greetings gr=new Greetings();
		gr.m1();

		String s=gr.m2();
		System.out.println(s);
		gr.m3("john");
		
		String var=gr.m4("david");
		System.out.println(var);
		
	}

}
