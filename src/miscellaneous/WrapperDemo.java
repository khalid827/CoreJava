package miscellaneous;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		//create primitive types
		int a=5;
		float b=10.10f;
		
		//convert into wrapper object
		Integer aobj=a;   //Auto boxingg convert value type to object
		Float bobj=b;
		
		//create wrapper class object
		Integer x=Integer.valueOf(10);
		Double y=Double.valueOf(20000.00);
		
		//convert into primitive type
		int p=x.intValue();  //auto Unboxing obj to value type
		double q=y.doubleValue();
		
		System.out.println(p+" "+q);
		System.out.println(aobj+" "+bobj);
		
		char e='a';
		Character objE=e;  //boxing
		System.out.println(objE);
		System.out.println(Character.isUpperCase(e));
		
		Double d=200.5;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		
		String hex="0xff";
		String oct="005";
		
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
		
	}

}
