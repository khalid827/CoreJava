package practise;

public class Encapsulation2Demo {
	
	public static void main(String[] args) {
		
		Encapsulation2 ducati=new Encapsulation2();
		Encapsulation2 honda=new Encapsulation2();
		
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		
		ducati.decreaseSpeed(80);
		System.out.println(ducati.getSpeed());
	}

}
