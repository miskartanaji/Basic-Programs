import java.util.Scanner;

public class Even_odd {
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter the Number");
    int number=sc.nextInt();
    if(number%2==0) {
    	System.out.println("Entered number is Even");
        
    }
    	else {
    System.out.println("Entered number is odd");    	
    }
}
}
