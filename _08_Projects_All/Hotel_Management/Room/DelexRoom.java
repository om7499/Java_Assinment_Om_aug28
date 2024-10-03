package oop.Room;

public class DelexRoom extends Room {
  private  double roomSize;
	public DelexRoom(String roomID, int roomNum, double roomFare,double roomSize) {
		super(roomID, roomNum, roomFare);
		this. roomSize =  roomSize;
	}
	void roomInfo() {
	      System.out.println("Delux room info");
		  System.out.println("Room Id                :  "+super.getRoomID());
		  System.out.println("Room num            :  "+ super.getRoomNum());
		  System.out.println("Room fare              :  "+ super.getRoomFare());
		  System.out.println("Room size              :  "+ this.roomSize) ;
		  System.out.println("--------------------------------------------------------------------");
		 }


}
