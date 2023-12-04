package project_1_Reservation_System;
/*
 * Name:Shaima Nimeri
 * Date: 10-14-2023
 * Description: The Passenger class contains the following fields:
    name: String
    phone: String
    seat: int //This is the seat number assigned 
    cost: int //This is the cost the passenger paid (each seat may have a different price)
    next: Passenger//This is a reference to the passenger that follows this passenger in the list
     previous: Passenger//This is a reference to the passenger that precedes this passenger in the list
    It contains  getters and setters for these attributes, a no-arg constructor, 
    and a constructor that accepts the following arguments: name, phone, seat and cost.*/
public class Passenger {
	private String name; //the name of the passenger
	private String phone; // the passenger's phone number
	private int seat; //the seat number assigned 
	private int cost; //the cost the passenger paid (each seat may have a different price)
	private  Passenger next; //a reference to the passenger that follows this passenger in the list
	private Passenger previous ;//a reference to the passenger that precedes this passenger in the list
	
	
	// no args constructor
	public Passenger() {
		
	}
	
	//constructor that accepts name, phone, seat and cost
	public Passenger(String name, String phone, int seat, int cost) {
		this.name = name;
		this.phone = phone;
		this.seat = seat;
		this.cost = cost;
	}

	//getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Passenger getNext() {
		return next;
	}

	public void setNext(Passenger next) {
		this.next = next;
	}

	public Passenger getPrevious() {
		return previous;
	}

	public void setPrevious(Passenger previous) {
		this.previous = previous;
	}
	
	@Override
	public String toString() {
		return "Passenger [name=" + name+ ", phone=" + phone + ", seat=" + seat + ", cost=" + cost /*+ ", next=" + next
				+ ", previous=" + previous */+ "]";
	}


	
	
}
