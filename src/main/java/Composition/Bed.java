package Composition;

public class Bed {
    private String type;
    private String name;

    public Bed(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
