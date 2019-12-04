public class Task_3 {
    public static void main(String[] args) {
        EulerMethod.eulerMethod(4, 0.5, 1, (x, t) -> -2 * Math.pow(t, 3) + 12 * Math.pow(t, 2) - 20 * t + 8.5);
        System.out.println();
        ModifiedEulerMethod.modifiedEulerMethod(4, 0.5, 1, (x, t) -> -2 * Math.pow(t, 3) + 12 * Math.pow(t, 2) - 20 * t + 8.5);
        System.out.println();
        EulerMethod.eulerMethod(4,0.25,1,(x,t)->-2*Math.pow(t,3)+12*Math.pow(t,2)-20*t+8.5);
        System.out.println();
        ModifiedEulerMethod.modifiedEulerMethod(4,0.25,1,(x,t)->-2*Math.pow(t,3)+12*Math.pow(t,2)-20*t+8.5);

    }//end of main
}//end of class
