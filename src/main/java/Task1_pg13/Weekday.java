package Task1_pg13;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void whichIsGreater(Weekday weekday) {
       if (this.compareTo(weekday) > 0) {
           System.out.println(this + " is predecessor of " + weekday);
       } else if (this.compareTo(weekday) < 0){
           System.out.println(this + " is successor of " + weekday);
       } else {
           System.out.println("They are equal");
       }
    }
//    a.compareTo(b) = 0  if (a == b)
//    a.compareTo(b) < 0  if (a < b)
//    a.compareTo(b) > 0  if (a > b)

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    public boolean isWeekDay() {
//        return this != SATURDAY  && this != SUNDAY;
        return !isHoliday();
    }




}
