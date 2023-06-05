package practise;

public class Encapsulation1 {
	
	//state
	private int speed;  //member variable that are specific to object
	
	//behaviour
	
	//inputs  -int speed
	//outputs -void
	//name    -setSpeed
	
	
	void setSpeed(int speed) { //local variable
		System.out.println(speed);  //100
		System.out.println(this.speed);//0
		this.speed=speed;    //this.speed =member variable   //speed =local variable
		System.out.println(this.speed); //100
	}
	
	int getSpeed() {
		return this.speed;
	}
}
