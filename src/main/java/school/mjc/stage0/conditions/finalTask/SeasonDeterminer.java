package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season = switch(monthNumber){
            case 11, 12, 1, 2, 3 -> "Winter";
            case 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10 -> "Fall";
            default -> "Wrong month number";
        };
        System.out.println(season);
    }
}
