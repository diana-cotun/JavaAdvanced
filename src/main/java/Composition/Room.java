package Composition;

public class Room {
    private int roomNumber;
    private Bed bed;
    private TV tv;

    public Room(int roomNumber, Bed bed, TV tv) {
        this.roomNumber = roomNumber;
        this.bed = bed;
        this.tv = tv;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", bed=" + bed +
                ", tv=" + tv +
                '}';
    }
}
