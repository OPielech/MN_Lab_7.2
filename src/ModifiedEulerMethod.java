public class ModifiedEulerMethod {

    public static void modifiedEulerMethod(int n, double h, double x0, Function function) {
        double[] result = new double[n + 1];
        double[] xHalf = new double[n + 1];
        result[0] = x0;
        double t = 0;
        xHalf[0] = result[0] + function.function(result[0], (t / 2)) * (h / 2);
        System.out.println("t = " + t + " x = " + result[0]);
        for (int i = 1; i < n; i++) {
            xHalf[i] = result[i - 1] + function.function(result[i - 1], (t / 2)) * (h / 2);
            result[i] = result[i - 1] + function.function(xHalf[i - 1], t + 0.5 * t) * h;
            t += h;

            System.out.println("t = " + t + " x = " + result[i]);
        }
    }//end of modifiedEulerMethod
}//end of class
