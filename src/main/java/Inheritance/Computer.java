package Inheritance;

public class Computer {
    protected String os;
    protected int ram;
    protected int storage;

//    protected in pachet si copii
//    default in pachet


    public Computer() {
    }

    public Computer(String os, int ram, int storage) {
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        System.out.println("Inside computer constructor");
    }

    public void print() {
        System.out.println("OS is: " + os);
        System.out.println("RAM is: " + ram);
        System.out.println("Storage is: " + storage);
    }

}
