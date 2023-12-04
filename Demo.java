/* name:Shaima Nimeri
 * date:10-9-2023
 * purpose: a train reservation system
 * This class will serve to accept user input and manipulate the Reservation doubly linked list.
The Demo class should instantiate a Reservation object and display a menu to the user that will allow for the following actions:
Add a new passenger to the reservation system
Insert a new passenger after the passenger that is currently pointed
If a passenger is being added/inserted to an empty reservation list, that passenger should then be set to be the one that is currently pointed.
Print the contents of the reservation list
Display the current passenger (including name, phone, seat and cost)
When displaying the current passenger for the first time, the first passenger in the reservation list should be displayed.
To accomplish this, create a Passenger reference variable and assign it the first Passenger in the Reservation  
Cancel the current reservation (meaning that remove the current passenger).
Display a message that the reservation of that specific passenger is canceled.
When removing the current passenger, the new current passenger will be the passenger that directly follows the removed passenger.
Skip to the next passenger
If you are at the end of the reservation list, the next Passenger should be the first Passenger in the reservation list.
Return to the previous passenger
Exit
Validate the user’s input for the menu option.  The user should be required to enter a valid menu option before advancing.
If any of the options chosen would not work due to there being no applicable passengers in the reservation list, an appropriate error message should be displayed.
The user should be allowed to repeatedly select menu options until they choose to Exit.  
*/
import java.util.Scanner;
public class Demo {


	    public static void main(String[] args) {
	    	//instantiate a Reservation object 
	        Reservation reservation = new Reservation();
	        Passenger currentPassenger = null;
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        while (true) {
	            displayMenu();// a method to display a menu to the user 
	            choice = getValidChoice(scanner);

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter passenger details:");
	                    scanner.nextLine();
	                    System.out.println("Enter the passenger name: ");
	                    String name = scanner.nextLine();
	                    System.out.println("Enter the passanger phone number: ");
	                    String phone = scanner.nextLine();
	                    System.out.println("Enter the passanger seat number:");
	                    int seat = scanner.nextInt();
	                    System.out.println("Enter the cost of the seat: ");
	                    int cost = scanner.nextInt();
	                    Passenger newPassenger = new Passenger(name, phone, seat, cost);

	                    if (reservation.getSize() == 0) {
	                        currentPassenger = newPassenger;
	                    }

	                    reservation.addPassenger(newPassenger);
	                    break;

	                case 2:
	                    if (currentPassenger == null) {
	                        System.out.println("No current passenger selected.");
	                    } else {
	                        System.out.println("Enter passenger details:");
	                        scanner.nextLine();
	                        System.out.println("Enter the passenger name: ");
	                        name = scanner.nextLine();
	                        System.out.println("Enter the passanger phone number: ");
	                        phone = scanner.nextLine();
	                        System.out.println("Enter the passanger seat number:");
	                        seat = scanner.nextInt();
	                        System.out.println("Enter the cost of the seat: ");
	                        cost = scanner.nextInt();
	                        newPassenger = new Passenger(name, phone, seat, cost);
                            reservation.insertAfter(newPassenger, currentPassenger);
	                        
	                    }
	                    break;

	                case 3:
	                    System.out.println(reservation);
	                    break;

	                case 4:
	                    if (currentPassenger != null) {
	                        System.out.println("Current Passenger: " + currentPassenger);
	                    } else {
	                        System.out.println("No current passenger selected.");
	                    }
	                    break;

	                case 5:
	                    if (currentPassenger != null) {
	                    	
	                        reservation.removePassenger(currentPassenger);
	                        System.out.println("Reservation canceled for "+ currentPassenger.getName());
	                        
	                        if (reservation.getSize() > 0) {
	                            currentPassenger = currentPassenger.getNext();
	                        } else {
	                            currentPassenger = null;
	                        }
	                    } else {
	                    
	                        System.out.println("No current passenger selected.");
	                        
	                    }
	                    break;

	                case 6:
	                    if (currentPassenger == null) {
	                        System.out.println("No current passenger selected.");
	                    } else {
	                        currentPassenger = currentPassenger.getNext();
	                        if (currentPassenger == null) {
	                            currentPassenger = reservation.getFirstPassenger();
	                        }
	                    }
	                    break;

	                case 7:
	                    if (currentPassenger == null) {
	                        System.out.println("No current passenger selected.");
	                    } else {
	                        currentPassenger = currentPassenger.getPrevious();
	                        if (currentPassenger == null) {
	                            currentPassenger = reservation.getLastPassenger();
	                        }
	                    }
	                    break;

	                case 8:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid menu option.");
	            }
	        }
	    }

	    private static void displayMenu() {
	        System.out.println("Menu Options:");
	        System.out.println("1. Add a new passenger");
	        System.out.println("2. Insert a new passenger after the current passenger");
	        System.out.println("3. Print the contents of the reservation list");
	        System.out.println("4. Display the current passenger");
	        System.out.println("5. Cancel the current reservation");
	        System.out.println("6. Skip to the next passenger");
	        System.out.println("7. Return to the previous passenger");
	        System.out.println("8. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static int getValidChoice(Scanner scanner) {
	        while (!scanner.hasNextInt()) {
	            System.out.println("Invalid input. Please enter a valid menu option.");
	            scanner.next(); // Consume the invalid input
	        }
	        return scanner.nextInt();
	    }
	}



