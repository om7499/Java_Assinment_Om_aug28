package oop.Room;

public class Main {

	public static void main(String[] args) {
		
		DelexRoom dx = new DelexRoom("delex-Room-12",11,1200.50,35.25);
		dx.roomInfo();
		
		Standerd_Room Sr = new Standerd_Room("Stan-room-10",22,1000.50,true);
		Sr.roomInfo();
       
		Customer cu = new Customer("101","om","bh7876",Sr);
		cu.rentRoom();
         cu.show();
      
	}

}
