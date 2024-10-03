package oop.Room;

public class Customer extends  Person{
      private Room room;
      private String roomId;
	public Customer(String id, String name, String contactNo,Room room) {
		super(id, name, contactNo);
		this.room = room;
		
	}
	public void rentRoom() {
		this.roomId = room.getRoomID();
	}
  void show() {
	  System.out.println("Costomer info");
	  System.out.println("Customer id                     :   "+super.id);
	  System.out.println("Customer Name               :   "+ super.name);
	  System.out.println("Custtomer contact no      :   "+ super.contactNo);
	  System.out.println("Costomer room id            :   "+this.roomId);
	  System.out.println("----------------------------------------------------------------");
  }
}
