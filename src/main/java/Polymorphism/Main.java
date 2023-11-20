package Polymorphism;

import Task2_pg2.Lecturer;
import Task2_pg2.Person;
import Task2_pg2.Student;
import Interfaces.NetflixStreamingPlayer;
import Interfaces.PrimeStreamingPlayer;
import Interfaces.StreamingPlayer;

public class Main {
    public static void main(String[] args) {
        Person person = new Student("Ion", "address", "University", 2022, 6000);
        person.showDetails();
        System.out.println("--------------------");


        Student student = new Student("Ion", "address", "University", 2022, 6000);
        processPerson(student);
        Lecturer lecturer = new Lecturer("Vasile", "address2", "specialization", 2000);
        processPerson(lecturer);

        StreamingPlayer netflix = new NetflixStreamingPlayer();
        netflix.playMovie("movie1");
        netflix = new PrimeStreamingPlayer();
        netflix.playMovie("movie2");



    }
    public static void processPerson(Person person) {
        person.showDetails();
        System.out.println("Accommodation is: " + person.getAccommodationPrice());
        System.out.println("------------------------");
    }

}
