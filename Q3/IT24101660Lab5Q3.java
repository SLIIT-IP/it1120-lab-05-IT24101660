import java.util.Scanner;

public class IT24101660Lab5Q3 
{
    public static void main(String[] args) 
	{

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Start Date (1 - 31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1 - 31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) 
		{
            System.out.println("Error: Days must be between 1 and 31");
            return; 	
        }
		else if ( startDate > endDate)
		{
			System.out.println("Error: Start date must be less than End date");
		}
		
    System.out.println(" ");
	
        if (startDate <= endDate) 
		{
			final double roomCharge = 48000.0;
            System.out.println("Room Charge Per Day: Rs. " + roomCharge + "/=");
			
            int numberOfDays = endDate - startDate  ;
            System.out.println("Number of days reserved: " + numberOfDays);

            double totalPaid;
            if (numberOfDays < 3)
			{
                totalPaid = numberOfDays * roomCharge;
                System.out.println("Total Amount to be Paid: Rs. " + totalPaid + "/=");
            } 
			else if (numberOfDays >= 3 && numberOfDays < 5) 
			{
                totalPaid = numberOfDays * roomCharge * 90 / 100;
                System.out.println("Total Amount to be Paid : Rs. " + totalPaid + "/=");
            } 
			else if (numberOfDays >= 5) 
			{
                totalPaid = numberOfDays * roomCharge * 80 / 100;
                System.out.println("Total Amount to be Paid : Rs. " + totalPaid + "/=");
            }
			
        }
    }
}
