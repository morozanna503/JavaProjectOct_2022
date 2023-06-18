package project_utils;

public class Utils {
    public static int taskNumber = 0;
    public static String line = " _______________________________";

    public static int printTask() {
        System.out.println("\u001B[34m" + line + " Task № " + ++taskNumber + line + "\u001B[0m");
        return taskNumber;
    }
    public static int randomNumInclusive(int a, int b){
        return  (int) (Math.random() * (a - b + 1)) + b;
    }
}
