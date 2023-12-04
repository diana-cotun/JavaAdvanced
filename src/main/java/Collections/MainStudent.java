package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Diana", 20);
        Student student2 = new Student("Vlad", 20);
        Student student3 = new Student("Diana", 18);
        Student student4 = new Student("Vlad", 5);
        Student student5 = new Student("Ana", 50);

        List<Student> students = new ArrayList<>();
        student1.setAge(29);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }

        };
        students.sort(nameComparator);
        System.out.println("---------------------------");
        Collections.sort(students, nameComparator);
        System.out.println(students);
        System.out.println("-----------------------");

        Comparator<Student> nameComparatorReverse = nameComparator.reversed();
        students.sort(nameComparatorReverse);
        System.out.println(students);

        Comparator<Student> nameAndAgeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int result = student1.getName().compareTo(student2.getName());
                if (result == 0) {
                    return Integer.compare(student1.getAge(), student2.getAge());
                }
                return result;


//                if (student1.getName().equals(student2.getName())) {
//                    return Integer.compare(student1.getAge(), student2.getAge());
//                }
//                return student1.getName().compareTo(student2.getName());
            }
        };

        students.sort(nameAndAgeComparator);
        System.out.println(students);


    }
}
