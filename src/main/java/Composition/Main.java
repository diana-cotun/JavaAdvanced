package Composition;

public class Main {
    public static void main(String[] args) {

        Bed bed1 = new Bed("single", "Dormeo");
        TV tv1 = new TV("Samsung", 160);
        Room room = new Room(1, bed1, tv1);

        TV tv2 = new TV("Lg", 50);
        room.setTv(tv2);

        System.out.println(room);
    }


}
