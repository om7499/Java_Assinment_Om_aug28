package oop.Room;

public  class Standerd_Room extends Room{
         private boolean ac_Avalability;  
	
	public Standerd_Room(String roomID, int roomNum, double roomFare, boolean ac_Avalability) {
		super(roomID, roomNum, roomFare);
		this.ac_Avalability =ac_Avalability ;
	}
	void roomInfo() {
	      System.out.println("Standerd  room info    ");
		  System.out.println("Standerd room id                    :  "+super.getRoomID());
		  System.out.println("Standerd room Number          :  "+ super.getRoomNum());
		  System.out.println("Standerd room fare                  :  "+ super.getRoomFare());
		  System.out.println("Standerd Ac availabe                :  "+ this.ac_Avalability) ;
		  System.out.println("----------------------------------------------------------------------");
				  }

}
