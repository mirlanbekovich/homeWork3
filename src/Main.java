public class Main {

    public static void main(String[] args) {

        double[] numbers = {4.5, -0.4, 1.3, -1.2, 3.5, -6.0, -9.2, 8.7, 8.5, 6.1,
                1.0, 7.6, 5.6, 0.3, 0.9};
        double result = 0;
        double totly = 0;
        boolean chik = false;

        for (double d : numbers) {
            if (d < 0) {
                chik = true;

            }
            if (chik && d > 0) {
                result += d;
                totly++;
                chik = false;
            }
        }
        System.out.println("Среднее арифметическое: " + result / totly);

    }
}
