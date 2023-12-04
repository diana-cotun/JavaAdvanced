package AbstractClass;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }



    @Override
    public void makeSound() {
        System.out.println("Miau miau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
