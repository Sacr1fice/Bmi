public class BmiService {
    public float calculate(double weight, double height) {
        int bmi;
        bmi = (int)(weight / (height * height));
        return bmi;
    }
}
