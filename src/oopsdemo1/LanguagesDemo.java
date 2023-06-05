package oopsdemo1;

//Program to demonstrate constructors in Java

class Language
{
	private String s;
    private int version;
    
    Language()  //Implicit  / No argument constructer
    {
    	System.out.println("I am a implicit Constructer");
    	s="Python";
    	System.out.println("Hello from :"+s);
    }
    Language(String lang)     //Parametarized constructer
    {
    	System.out.println("I am a parametarized constructer");
    	this.s=lang;
    	System.out.println("hello from :"+s);
    }
    
    Language(String lang,int ver)// Parameterized Constructor with 2 Args
    {
        System.out.println("Iam a Parameterized Constructor with 2  Arguements");
        this.s=lang;
        this.version=ver;
        System.out.println("Hello from : "+s+" V."+version);
    }
	
}
public class LanguagesDemo {
	
	public static void main(String[] args) {
		Language l1=new Language();
		Language l2=new Language();
		
		Language l3=new Language("Ruby");
		Language l4=new Language("Scala");
		Language l5=new Language("Java",2);
		
		
	}

}
