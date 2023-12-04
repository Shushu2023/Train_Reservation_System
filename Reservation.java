/*
 * Name: Shaima Nimeri
 * Date:10/09/2023
 * purpose: 
 * the Reservation class will function as a doubly linked list that contains Passenger objects.
 *  This class contains the following attributes:
    head: Passenger
    A dummy node (a blank passenger object that will represent the first passenger in the reservation list) 
    tail: Passenger
    A dummy node (a blank passenger object that will represent the last passenger in the reservation list)
    size: int // The number of reservations in the reservation list
    The Reservation class contains a no-arg constructor which initializes the size, head and tail attributes.  This no-arg constructor should also properly connect the head and tail nodes of the doubly linked list.
    The Reservation class also contains the following methods:
    A method that accepts a Passenger object and adds it to the end of the reservation list.
    A method that accepts two Passenger objects (a new Passenger to be added, and a Passenger that is currently pointed in the reservation list). 
    This method will insert the new Passenger into the reservation list at the position directly after the Passenger that is currently pointed.
    A method that accepts a Passenger object, returns nothing, and removes the Passenger from the reservation list.
    A toString method that prints out the contents of the reservation list. This toString method should also calculate and display the number of passengers in the reservation list,
    as well as the total cost paid by the passengers in the list.*/

public class Reservation {
	    private Passenger head;
	    private Passenger tail;
	    private int size;
        
	    
	    //no args constructor
	    public Reservation() {
	        size = 0; //The number of reservations in the reservation list
	        head = new Passenger(); // Dummy head node
	        tail = new Passenger(); // Dummy tail node
	        head.setNext(tail);
	        tail.setPrevious(head);
	    }

	    public void addPassenger(Passenger passenger) {
	        // Inserting at the end
	        Passenger lastPassenger = tail.getPrevious();
	        lastPassenger.setNext(passenger);
	        passenger.setPrevious(lastPassenger);
	        passenger.setNext(tail);
	        tail.setPrevious(passenger);
	        size++;
	    }

	    public void insertAfter(Passenger newPassenger, Passenger currentPassenger) {
	        // Insert new passenger after the current passenger
	        if (currentPassenger != null) {
	            newPassenger.setPrevious(currentPassenger);
	            newPassenger.setNext(currentPassenger.getNext());
	            currentPassenger.getNext().setPrevious(newPassenger);
	            currentPassenger.setNext(newPassenger);
	            size++;
	        }
	    }

	    public void removePassenger(Passenger passenger) {
	        // Removing a passenger
	        if (passenger != head && passenger != tail) {
	            passenger.getPrevious().setNext(passenger.getNext());
	            passenger.getNext().setPrevious(passenger.getPrevious());
	            size--;
	        }
	    }

	    
	    public int getSize() {
	        return size;
	    }

	    public Passenger getFirstPassenger() {
	        return head.getNext();
	    }

	    public Passenger getLastPassenger() {
	        return tail.getPrevious();
	    	
	    }

	    
	    @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder();
	        Passenger current = head.getNext();
	
	        int totalCost = 0;

	        result.append("Passenger List:\n");
	        while (current != tail) {
	            result.append(current.toString()).append("\n");
	        	//result.append(current.getName());
	            totalCost += current.getCost();
	            current = current.getNext();
	        }

	        result.append("Number of Passengers: ").append(size).append("\n");
	        result.append("Total Cost: ").append(totalCost);

	        return result.toString();
	    }
	    

}
