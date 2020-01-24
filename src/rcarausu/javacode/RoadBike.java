package rcarausu.javacode;

public class RoadBike extends Bicycle {

    private int tireWidth;

    public RoadBike(int tireWidth, int cadence, int speed, int gear) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The road bike has a seat height of " + tireWidth + " millimetres.");
    }
}
