package basics;
//Program to demonstrate jump statements - break & continue
public class JumpDemo {
	public static void main(String[] args) {
		int i,j;
	       
        System.out.println("********** Break Demo ***********");
       
        for(i=1;i<=10;i++)
        {
            if(i==8)
            {
              break;     // Terminates Loop
            }
           
            System.out.println(i+" khalid");
        }
        System.out.println("********* Continue Demo **********");
        
        for(j=1;j<=10;j++)
        {
            if(j==4)
            {
               continue;     // Skips the current Iteration
            }
            System.out.println(j + " Java");
        }
	}
}
