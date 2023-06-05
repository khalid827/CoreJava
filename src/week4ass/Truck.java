package week4ass;

public interface Truck {

	public int getAxles();
	
	public int getTotalWeight();
	
	public String className();
}

interface TollBooth{
	
	public void calculateToll(Truck f);
	public void resetReciept();
	public void display();
	
	
	
}
