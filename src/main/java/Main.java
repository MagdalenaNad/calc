public class Main {

    public static void main(String[] args) {
        System.out.println(calculus(0, 15, 100000));

    }

    private static double calculus(double begin, double end, double number) {
        double sum = 0;
        double width = (end - begin) / number;
        for (int i = 0; i < number; i++) {
            sum += function(begin + (i + 0.5) * width) * width;
        }

        return sum;
    }

    private static double function(double x) {
        return (3 * Math.sin(x)) -
                (0.2 * Math.pow(x, 3)) +
                (3 * Math.pow(x, 2));
    }
}
