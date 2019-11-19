public class Room {
    private String bed;
    private String chair;
    private int pillows;
    private String tv;
    private String fan;
    private boolean lamp;
    private int door;
    private int bathroom;

    public Room(String bed, String chair, int pillows, String tv, String fan, boolean lamp, int door, int bathroom) {
        this.bed = bed;
        this.chair = chair;
        this.pillows = pillows;
        this.tv = tv;
        this.fan = fan;
        this.lamp = lamp;
        this.door = door;
        this.bathroom = bathroom;
    }

    public void switchLampOnOff(){

        if(lamp){
            System.out.println("Turn Lamp off");
        }else{
            System.out.println("turn lamp on");
        }
    }


    public void reservation( boolean availability){
        if(availability){
            System.out.println("Room is available, BOOK IT");
        }else{
            System.out.println("House is full, no rooms available");
        }



    }
    public void roomBooked(){
        System.out.println("The room is booked till August");
    }


    public String getBed() {
        return bed;
    }

    public String getChair() {
        return chair;
    }

    public int getPillows() {
        return pillows;
    }

    public String getTv() {
        return tv;
    }

    public String getFan() {
        return fan;
    }

    public boolean getIsLamp() {
        return lamp;
    }

    public int getBathroom(){

        return bathroom;
    }


}
