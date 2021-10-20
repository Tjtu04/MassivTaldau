import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 50));
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
        int max = getMax(arr);
        System.out.println("Maximum: " + max);
        // min tabatin func shakiramiz
        int min = getMin(arr);
        System.out.println("Minimum: " + min);
        int sum= getSum(arr);
        System.out.println("Sum:" +sum);
    }

    //maximum tabu func
    public static int getMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    // minimum tabu func
    public static int getMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    // bagan boinsha suriptau
    public void swapColumns(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            }
        }
    }
    // Summa
    public static int getSum(int[][] arr) {
            int sum=0;
            for (int i=0;i<arr.length;i++){
                for(int j=0;j< arr.length;j++){
                    sum+=arr[i][j];
                }
            }
            return sum;
    }
}