package practise;

public class Encapsulation1Demo {

	public static void main(String[] args) {
		
		Encapsulation1 ducati=new Encapsulation1();
		Encapsulation1 honda=new Encapsulation1();
		
		ducati.setSpeed(100);
		//System.out.println(ducati.getSpeed());
		
		honda.setSpeed(80);
		//System.out.println(honda.getSpeed());
		
		//ducati.setSpeed(20);
		//honda.setSpeed(0);
		
		int ducatiSpeed=ducati.getSpeed();  //get ducatti speed
		ducatiSpeed=ducatiSpeed+100;   //increase it by 100
		ducati.setSpeed(ducatiSpeed);//set it to ducati
		
		int hondaSpeed=honda.getSpeed();  //get honda speed
		hondaSpeed=hondaSpeed+100;   //increase it by 100
		honda.setSpeed(hondaSpeed);//set it to honda
		
		
		

	}

}
