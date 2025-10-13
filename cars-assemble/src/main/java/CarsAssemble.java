public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 0){
            return 0;
        } else if (speed < 5) {
            return speed * 221;
        } else if (speed < 9) {
            return speed * 221 * ((double) 90 / 100);
        } else if (speed < 10){
            return speed * 221 * ((double) 80 / 100);
        } else if (speed == 10) {
            return speed * 221 * ((double) 77 / 100);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
