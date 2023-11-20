package Task2_pg2;

import Inheritance.Laptop;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ion", "address", "University", 2022, 6000);
        Lecturer lecturer = new Lecturer("Vasile", "address2", "specialization", 2000);

        Person student2 = new Student("Diana", "hdhdjd", "Java", 2000, 2000);

        student.showDetails();
        System.out.println("---------------------------");
        student2.showDetails();
        System.out.println("Student must pay: " + student2.getAccommodationPrice());

    }
}
