import exercisesPack2.*;

public class Main {
    public static void main(String[] args) {

        //AreaCalculator
        AreaCalculator ac = new AreaCalculator();

        System.out.println(ac.area(5));
        System.out.println(ac.area(-1));
        System.out.println(ac.area(5.0, 4.0));
        System.out.println(ac.area(-1.0, 4.0));

        //BarkingDog
        BarkingDog bd = new BarkingDog();

        System.out.println(bd.shouldWakeUp(true, 1));
        System.out.println(bd.shouldWakeUp(false, 2));
        System.out.println(bd.shouldWakeUp(true, 8));
        System.out.println(bd.shouldWakeUp(true, -1));

        //DecimalComparator
        DecimalComparator dc = new DecimalComparator();

        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(dc.areEqualByThreeDecimalPlaces(3.175, -3.176));
        System.out.println(dc.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        //EqualSumChecker
        EqualSumChecker eqc = new EqualSumChecker();

        System.out.println(eqc.hasEqualSum(1, 1, 1));
        System.out.println(eqc.hasEqualSum(1, 1, 2));
        System.out.println(eqc.hasEqualSum(1, -1, 0));

        //EqualityPrinter
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);

        EqualityPrinter.printEqual(-1, -1, -1);
        EqualityPrinter.printEqual(1, 2, 3);

        //LeapYear
        LeapYear ly = new LeapYear();

        System.out.println(ly.isLeapYear(-1600));
        System.out.println(ly.isLeapYear(1600));
        System.out.println(ly.isLeapYear(2017));
        System.out.println(ly.isLeapYear(2000));

        //MeasurementCalculator
        MeasurementCalculator mc = new MeasurementCalculator();

        System.out.println("");

        System.out.println(mc.calcFeetandInchesToCentimeters(-1, 2));
        System.out.println(mc.calcFeetandInchesToCentimeters(-1, 13));
        System.out.println(mc.calcFeetandInchesToCentimeters(-5, 13));
        System.out.println(mc.calcFeetandInchesToCentimeters(0, 22));
        System.out.println(mc.calcFeetandInchesToCentimeters(4, 13));
        System.out.println(mc.calcFeetandInchesToCentimeters(-12));
        System.out.println(mc.calcFeetandInchesToCentimeters(-1));
        System.out.println(mc.calcFeetandInchesToCentimeters(-2));

        System.out.println("");

        System.out.println(mc.calcFeetandInchesToCentimeters(1, 2));
        System.out.println(mc.calcFeetandInchesToCentimeters(0, 12));
        System.out.println(mc.calcFeetandInchesToCentimeters(12));
        System.out.println(mc.calcFeetandInchesToCentimeters(2));
        System.out.println(mc.calcFeetandInchesToCentimeters(13));
        System.out.println(mc.calcFeetandInchesToCentimeters(70));
        System.out.println(mc.calcFeetandInchesToCentimeters(100));

        //MegaBytesConverter
        MegaBytesConverter megac = new MegaBytesConverter();

        megac.printMegaBytesAndKiloBytes(2500);
        megac.printMegaBytesAndKiloBytes(-1024);
        megac.printMegaBytesAndKiloBytes(5000);

        //MinutesToYearsAndDaysCalculator
        MinutesToYearsAndDaysCalculator mtydc = new MinutesToYearsAndDaysCalculator();

        mtydc.printYearsAndDays(525600);
        mtydc.printYearsAndDays(1051200);
        mtydc.printYearsAndDays(561600);

        //PlayingCat
        PlayingCat pc = new PlayingCat();

        System.out.println(pc.isCatPlaying(true, 10));
        System.out.println(pc.isCatPlaying(false, 36));
        System.out.println(pc.isCatPlaying(false, 35));

        //TeenNumberChecker
        TeenNumberChecker tnc = new TeenNumberChecker();

        System.out.println(tnc.hasTeen(9, 99, 19));
        System.out.println(tnc.hasTeen(23, 15, 42));
        System.out.println(tnc.hasTeen(22, 23, 34));

        //SpeedConverter
        SpeedConverter sc = new SpeedConverter();

        sc.printConversion(1.5);
        sc.printConversion(10.25);
        sc.printConversion(-5.6);
        sc.printConversion(25.42);
        sc.printConversion(75.114);
        sc.printConversion(95.75);
        sc.printConversion(-2.0);

    }
}
