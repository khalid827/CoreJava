package java8features;

@FunctionalInterface
interface MyFI
{
	public String sayHello();  //By Default abstract
	//public String sayHello1();
	
	
}

public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		MyFI msg=()->{return "Hello World";};  //Lambda Expression
		
		System.out.println(msg.sayHello());

}
}
