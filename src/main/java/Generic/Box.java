package Generic;

public class Box {
    private int lenght;
    private int width;
    private Object content;

    public Box(int lenght, int width, Object content) {
        this.lenght = lenght;
        this.width = width;
        this.content = content;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", content=" + content +
                '}';
    }
}
