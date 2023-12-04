# Train_Reservation_System
This  program should contain three separate classes: a Passenger class, a Reservation class, and a Demo class.
The Reservation class  functions as a doubly linked list that contains Passenger objects.  
The Demo class is used to make modifications to the Reservation list.
Passenger Class contain the following fields:name, phone, seat, cost(cost the passenger paid (each seat may have a different price)), next(a reference to the passenger that follows this passenger in the list), and previous (reference to the passenger that precedes this passenger in the list).
The Passenger contains a constructor that accepts the  name, phone, seat and cost.

Reservation Class act as our doubly linked list with  a head: Passenger,  dummy node (a blank passenger object that will represent the first passenger in the reservation list)  and a tail: Passenger, dummy node (a blank passenger object that will represent the last passenger in the reservation list), and size represents the number of reservations in the reservation list.
The Reservation class also contain the following methods:
A method that accepts a Passenger object and adds it to the end of the reservation list.
A method that accepts two Passenger objects (a new Passenger to be added, and a Passenger that is currently pointed in the reservation list). This method will insert the new Passenger into the reservation list at the position directly after the Passenger that is currently pointed..
A method that accepts a Passenger object, returns nothing, and removes the Passenger from the reservation list.
A toString method that prints out the contents of the reservation list. This toString method should also calculate and display the number of passengers in the reservation list, as well as the total cost paid by the passengers in the list.

Demo Class
This class serves to accept user input and manipulate the Reservation doubly linked list.
The Demo class instantiates a Reservation object and display a menu to the user that will allow for the following actions:
Add a new passenger to the reservation system
Insert a new passenger after the passenger that is currently pointed
If a passenger is being added/inserted to an empty reservation list, that passenger should then be set to be the one that is currently pointed.
Print the contents of the reservation list
Display the current passenger (including name, phone, seat and cost)
When displaying the current passenger for the first time, the first passenger in the reservation list should be displayed.
When a reservation is canceled,display a message that the reservation of that specific passenger is canceled.
When removing the current passenger, the new current passenger will be the passenger that directly follows the removed passenger.
Skip to the next passenger
If you are at the end of the reservation list, the next Passenger should be the first Passenger in the reservation list.
Return to the previous passenger
Exit
THe user's input is validated  for the menu option. 
The user is required to enter a valid menu option before advancing.
If any of the options chosen don't apply  due to there being no applicable passengers in the reservation list, an appropriate error message is be displayed.
The user is be allowed to repeatedly select menu options until they choose to Exit.  
