public class Task_4 {
    public static void main(String[] args) {
        ModifiedEulerMethod.modifiedEulerMethod(30, 0.5, 0, (x, t) -> 9.81 - (12.5 / 68.1) * x);
        System.out.println();
        ModifiedEulerMethod.modifiedEulerMethod(30, 0.5, 0, (x, t) -> 9.81 - ((12.5 / 68.1) * x * (x + (8.3 * Math.pow((x / 46), 2.2)))));
    }//end of main
}//end of class
