package exercisesPack2;

public class MeasurementCalculator {

    // In an actual application you would most likely define
    // the values utilised as a single foot and inch as
    // constants as they will not change
    // however I do not see this as necessary for this exercise.

    public MeasurementCalculator() {
    }

    // 1ft = 30.48cm
    // 1in = 2.54cm
    public double calcFeetandInchesToCentimeters(int feet, int inches) {
        if (!(feet >= 0 && (inches >= 0 && inches <= 12))) {
            return -1;
        }
        return ((feet * 30.48d) + (inches * 2.54d));
    }

    public double calcFeetandInchesToCentimeters(int inches) {
        if (!(inches >= 0)) {
            return -1;
        }
        return (calcFeetandInchesToCentimeters(inches / 12, inches % 12));
        // for the challenge it is asked to be done like this
    }

}
