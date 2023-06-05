package week4ass;

public class Ford implements Truck{
	
	private int axles;
	private int totalWeight;
	String className="Ford";
	
	public Ford(int axles, int totalWeight) {
		this.axles = axles;
		this.totalWeight = totalWeight;
	}

	@Override
	public int getAxles() {

		return axles;
	}

	@Override
	public int getTotalWeight() {
		
		return totalWeight;
	}

	@Override
	public String className() {
		
		return className;
	}
	
	

}
