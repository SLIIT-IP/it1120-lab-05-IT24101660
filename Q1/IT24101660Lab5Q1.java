import java.util.Scanner;

public class IT24101660Lab5Q1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int numberF = value.nextInt();

        System.out.print("Enter the second integer: ");
        int numberS = value.nextInt();

        System.out.print("Enter the third integer: ");
        int numberT = value.nextInt();
 
               
		
		System.out.println("User entered numbers are :"+ numberF+" " + numberS+" " + numberT+" ");

        if (numberF < numberS && numberF < numberT) 
		{
            System.out.println("The Smallest number is: " + numberF);
        } 
		else if (numberS < numberT) 
		{
            System.out.println("The Smallest number is: " + numberS);
        } 
		else 
		{
            System.out.println("The Smallest number is: " + numberT);
        }
		
		 if (numberF > numberS && numberF > numberT) 
		 {
			 System.out.println("The Largest number is:"+ numberF);
		 }
		 else  if (numberS>numberT)
		     {
			 System.out.print("The Largest number is:"+ numberS);
			 }
			 else 
			 {
				 System.out.print("The Largest number is:"+numberT);
			 }
				 
    }
}
