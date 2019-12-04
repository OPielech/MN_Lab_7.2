public class Task_5 {
    public static void main(String[] args) {
        EulerMethod.eulerMethod(4, 0.5, 1, (x, t) -> x * Math.pow(t, 2) - 1.1 * x);
        System.out.println();
        ModifiedEulerMethod.modifiedEulerMethod(4, 0.5, 1, (x, t) -> x * Math.pow(t, 2) - 1.1 * x);
        System.out.println();
        EulerMethod.eulerMethod(8, 0.25, 1, (x, t) -> x * Math.pow(t, 2) - 1.1 * x);
        System.out.println();
        ModifiedEulerMethod.modifiedEulerMethod(8, 0.25, 1, (x, t) -> x * Math.pow(t, 2) - 1.1 * x);
    }//end of main
}//end of class
