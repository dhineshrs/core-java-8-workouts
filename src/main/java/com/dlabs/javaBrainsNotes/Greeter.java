package javaBrainsNotes;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		GreetingImpl greetingImpl = new GreetingImpl();
		greeter.greet(greetingImpl);
		
		myLambdas MyLambdas = () -> System.out.println("HelloWorld !!");
		MyAdd myadd = (int a, int b) -> a + b;
		
	}

	public void greet(Greeting greeting) {
		greeting.perform();
	}
}

interface myLambdas {
	public void foo();
}

interface MyAdd {
	public int add(int a, int b);
}