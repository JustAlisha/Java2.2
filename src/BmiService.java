public class BmiService {

    public int calculate(int weightInkg, double heightInMeters) {
        double weightInKg = 0;
        double bmi = weightInKg / heightInMeters / heightInMeters;
        return (int) bmi;
    }
}
