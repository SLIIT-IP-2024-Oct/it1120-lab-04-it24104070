import java.util.*;

class IT24104070Lab4Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		
		
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("\nThe number is : Positive");
        } 
        else if(number < 0 ){
			System.out.println("\nThe number is : Negative");
		}
		else{
			System.out.println("\nThe number is : Zero");
			}
    
			System.out.println();
	}

}

