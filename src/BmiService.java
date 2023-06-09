import static java.lang.Math.pow;

public class BmiService {
    public float calculate(double weight, double height) {
        int bmi;
        bmi = (int)(weight / pow(height, 2));
        return bmi;
    }
}
