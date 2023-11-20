package Composition;

public class TV {
    private String brand;
    private int size;

    public TV(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
