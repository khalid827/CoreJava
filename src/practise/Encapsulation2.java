package practise;

public class Encapsulation2 {
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>0)
		{
			this.speed = speed;
		}
		
	}
	
	public void increaseSpeed(int howMuch)
	{
		this.speed=this.speed+howMuch;
	}
	
	public void decreaseSpeed(int howMuch)
	{
		//if(this.speed-howMuch>0)
			//this.speed=this.speed-howMuch;
		
		//or
		setSpeed(this.speed-howMuch);
	}

}
