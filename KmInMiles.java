public class KmInMiles {
    public static void main(String[] args) {

        double Kilometers = 15.0;
        double miles = Kilometers / 1.609344;
        double speed = miles / ((50.0 + 30.0 / 60.0) /  60.0);

        System.out.println(speed);

    }
}
