public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double height = 1.80;
        int bmi = (int) service.calculate(weight, height);
        System.out.println(bmi);
    }
}