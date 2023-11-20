package InnerClass;

public class Main {
    public static void main(String[] args) {
//        Outer outer = new Outer("Rex");
//        Outer.Inner inner = outer.new Inner("Inner");
//
//        Outer outer2 = new Outer("Tom");
//        Outer.Inner inner2 = outer2.new Inner("MyInner");
//
//        inner.print();
//        System.out.println("-------------");
//        inner2.print();
//
//        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();
//        System.out.println("-------------");
//        nestedStatic.printStatic();


        Movie.MovieBuilder builder1 = new Movie.MovieBuilder();
        Movie movie1 = builder1.setTitle("Batman")
                               .setDistributor("Netflix")
                               .setDirectorName("Steve")
                               .setDirectorName("Jhon")
                               .setYearOfRelease(2020)
                               .setGenre("action")
                               .build();

        System.out.println(movie1);

        Movie movie2 = new Movie.MovieBuilder().setTitle("Spider man").setGenre("comedy").build();
        movie2.setYearOfRelease(2020);
        System.out.println(movie2);
        System.out.println();

        Car car1 = new Car("Bmw", "economy");
        System.out.println(car1);

    }
}
