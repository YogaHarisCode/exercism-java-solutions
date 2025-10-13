
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {
        var isDayWithoutBirds = false;
        for (var bird : birdsPerDay){
            if (bird == 0){
                isDayWithoutBirds = true;
                break;
            }
        }

        return isDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        var counter = 0;
        if (numberOfDays < birdsPerDay.length){
            for (int i = 0; i < numberOfDays; i++) {
                counter += birdsPerDay[i];
            }
        }else {
            for (var bird : birdsPerDay){
                counter += bird;
            }
        }

        return counter;
    }

    public int getBusyDays() {
        var busyDays = 0;

        for (var bird : birdsPerDay){
            if (bird >= 5){
                busyDays++;
            }
        }

        return busyDays;
    }
}
