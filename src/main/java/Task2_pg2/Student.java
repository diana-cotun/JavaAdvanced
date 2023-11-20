package Task2_pg2;

public class Student extends Person {
    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, double studyPrice) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
        System.out.println("Inside student constructor");
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(double studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studyPrice=" + studyPrice +
                '}';
    }

    @Override
    public double getAccommodationPrice() {
        return 200;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Type of study " + typeOfStudy);
        System.out.println("Year of study " + yearOfStudy);
        System.out.println("Study price " + studyPrice);
    }
}
