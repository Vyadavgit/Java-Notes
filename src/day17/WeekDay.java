package day17;

public enum WeekDay {
    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);

    private final int abbr;

    WeekDay (int abbr){
        this.abbr = abbr;
    }

    public int getAbbr(){
        return abbr;
    }
}
