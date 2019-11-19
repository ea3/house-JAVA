public class House {

    private int kitchen;
    private int diningRoom;
    private int windows;
    private int garage;
    private Room room;

    public House(int kitchen, int diningRoom, int windows, int garage, Room room) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.windows = windows;
        this.garage = garage;
        this.room = room;
    }



    public void  bookRoom(){
       getRoom().reservation(true);
    }
    private int getKitchen() {
        return kitchen;
    }

    private int getDiningRoom() {
        return diningRoom;
    }

    private int getWindows() {
        return windows;
    }

    private int getGarage() {
        return garage;
    }

    private Room getRoom() {
        return room;
    }
}
