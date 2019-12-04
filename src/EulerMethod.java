public class EulerMethod {

    public static void eulerMethod(int n, double h, double x0, Function function) {
        double[] result = new double[n + 1];
        result[0] = x0;
        double t = 0;
        System.out.println("t = " + t + " x = " + result[0]);
        for (int i = 1; i < n; i++) {
            t += h;
            result[i] = result[i - 1] + function.function(result[i - 1], t) * h;


            System.out.println("t = " + t + " x = " + result[i]);
        }
    }//end of eulerMethod
}//end of class
