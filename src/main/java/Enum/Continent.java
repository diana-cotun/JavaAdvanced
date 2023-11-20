package Enum;

public enum Continent {
    ASIA (44614000, 4700000000L),
    AFRICA (30365000, 1400000000L),
    NORTH_AMERICA(24230000, 600000000L),
    SOUTH_AMERICA(17814000, 43000000L),
    ANTARTICA(14200000, 0),
    EUROPE(10000000, 750000000L),
    OCEANIA(8511000, 40000000L);

    private int area;
    private long population;


    Continent(int area, long population) {
        this.area = area;
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "Area=" + area +
                ", Population=" + population +
                '}';
    }

    public static Continent getLargestContinent() {
       Continent[] continents = values();
       Continent largestContinent = null;
       for (int i = 0; i < continents.length; i++) {
           if (largestContinent == null || largestContinent.area < continents[i].area) {
               largestContinent = continents[i];
           }
       }
       return largestContinent;
    }




}
