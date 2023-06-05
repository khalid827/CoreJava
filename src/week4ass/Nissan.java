package week4ass;

public class Nissan implements Truck{
	
	private int axles;
	private int totalWeight;
	String className="Nissan";
	
	public Nissan(int axles, int totalWeight) {
		
		this.axles = axles;
		this.totalWeight = totalWeight;
	}

	@Override
	public int getAxles()
	{
		return axles;
	}

	@Override
	public int getTotalWeight() 
	{
		return totalWeight;
	}

	@Override
	public String className() {
		return className;
	}

}
