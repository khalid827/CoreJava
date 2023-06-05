package week4ass;

public class AlleghenyTollBooth implements TollBooth{
	
	int receiptsCollection;
    int trucksCollection;
	
    
	public AlleghenyTollBooth() {
		receiptsCollection=0;
		trucksCollection=0;
	}

	@Override
	public void calculateToll(Truck f)
	{
		int axles = f.getAxles();
        int totalWeight = f.getTotalWeight();
        int tollDue = 5*axles + 10*(totalWeight/500); 
        System.out.println("Arrival of  "+ f.className()+" Truck");
        System.out.print("Truck arrival - Axles: ");
        System.out.print(axles);
        System.out.print(" Total weight: ");
        System.out.print(totalWeight);
        System.out.print(" Toll due: $");
        System.out.println(tollDue);
        trucksCollection = trucksCollection + 1;
        receiptsCollection = receiptsCollection + tollDue;
		
	}

	
	public void resetReciept() 
	{
		System.out.println("*****Reset Reciepts**********");
		trucksCollection = 0;      
        receiptsCollection = 0;
        System.out.println("Totals since the last collection - Receipts: $"+receiptsCollection+" Trucks: "+trucksCollection);
	}

	@Override
	public void display()
	{
		System.out.println("*** Collecting receipts  ***");
		System.out.println("Totals since the last collection -Receipts: $"+receiptsCollection+" Trucks: "+trucksCollection);
		
	}


}
