package basics;

import java.util.Scanner;

//program below calculates the sum of only positive numbers entered by user

public class ContinueDemo {
	public static void main(String[] args) {
		Double number, sum = 0.0;

		 

        // create an object of Scanner
        Scanner input = new Scanner(System.in);
                  
              while (true) {
            System.out.print("Enter a number: ");

 

            // takes double input from user
            number = input.nextDouble();
         
            // if number is negative the loop skips
            if (number < 0.0) {
                continue;
        }
            sum+=number;
            System.out.println("Sum = " + sum);
           
}
	}

}
