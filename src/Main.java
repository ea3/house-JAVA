public class Main {
    public static void main(String [] args){
        Room room = new Room("King Size", "Poltrona", 4, "Samsung", "Patton", true, 2, 1);
        room.switchLampOnOff();
        House house = new House(1,1,10,2, room);
//        house.getRoom().switchLampOnOff();
//        house.getRoom().roomBooked();
        house.bookRoom();

    }

}
