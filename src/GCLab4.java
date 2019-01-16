import java.util.Scanner;
public class GCLab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		String userCont;
		String tableChoice;
		
		System.out.println("Learn your squares and cubes! Or, your multiplication tables!");
		System.out.println();
		
		do {
			System.out.println("Please enter an integer.");
			userInt = scnr.nextInt();
			System.out.println("Press 's' for squares and cubes. Press 'm' for multiplication table");
			tableChoice = scnr.next();
			if(tableChoice.equalsIgnoreCase("s")) {
			System.out.println("Number" + "     " + "Squared" + "     " + "Cubed");
			System.out.println("=======" + "     " + "=======" + "     " + "======");
			for(int i = 1; i < userInt+1; i++) {
				System.out.printf("%-12d" , i);
				System.out.printf("%-12d" , i*i);
				System.out.println(i*i*i);
			}
			}else if(tableChoice.equalsIgnoreCase("m")){
			System.out.println("The multiplication table for " + userInt + " is:");
			System.out.println("==================================");
			for(int i = 1; i < userInt+1; i++) {
				for(int n = 1; n < userInt+1; n++) {
				System.out.printf("%-5d", i*n);
				}
				System.out.println();
			}
			}else {
				System.out.println("You entered an invalid option.");
			}

			System.out.println("Do you want to continue? (y/n)");
			userCont = scnr.next();
		}while (userCont.startsWith("y"));
		System.out.println("Goodbye!");
		scnr.close();
	}

}
