package Task4_pg19;

import java.time.LocalDate;

public class Newspaper extends Media {

    private String name;
    private int noOfSections;

    public Newspaper(String title, LocalDate publicationDate, String name, int noOfSection) {
        super(title, publicationDate);
        this.name = name;
        this.noOfSections = noOfSection;
    }

    @Override
    public double calculatePrice() {
        return noOfSections * 200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSections() {
        return noOfSections;
    }

    public void setNoOfSections(int noOfSections) {
        this.noOfSections = noOfSections;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", noOfSection=" + noOfSections +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
