 package week4ass;

public class TestTollBooth {

	public static void main(String[] args) {
		TollBooth booth=new AlleghenyTollBooth();
		
		Truck ford=new Ford(5,12500);   // 5 axles and 12000 kilograms
		Truck nissan = new Nissan(2, 5000);  // 2 axles and 5000kg
		Truck daewoo = new DaewooTruck(6, 17000); 
		
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		booth.calculateToll(daewoo);
		
		booth.display();
		
		booth.resetReciept();
		
		

	}

}
