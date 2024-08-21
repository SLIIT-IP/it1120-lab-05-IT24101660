import java.util.Scanner;
public class IT24101660Lab5Q2
{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of new members introduced:");
		int newMember = input.nextInt();
		
		if (newMember < 0)
		{
			System.out.println("Input must be a number 0 or greater");
		}
		else if (newMember >= 5 )
		{
			System.out.println(" ");
			System.out.print("prize is a : Headphone");
			
		}
		
		switch(newMember)
		{
		
		case 0 : System.out.println(" ");
		          System.out.print(" no Prize");
				  break;
				  
		case 1 : System.out.println(" ");
		          System.out.print(" Pen ");
				  break;
				  
		case 2 : System.out.println(" ");
                  System.out.print(" Umbrella");
                   break;
   
        case 3 : System.out.println(" ");
                  System.out.print(" Bag ");
                  break;

        case 4 : System.out.println(" ");
                  System.out.print(" Travelling Chair ");
				  break;
				  
		}
				  
	}
}	
		