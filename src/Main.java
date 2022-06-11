import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input array dimensions below:");
        int rows = Integer.parseInt(bufferedReader.readLine());
        int columns = Integer.parseInt(bufferedReader.readLine());
        int[][] array = new int[rows][columns];

        System.out.println("Input array positive and negative numbers below:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }
        printArray(array);
        findNegativeNumbers(array);
    }
    public static void printArray (int[][] array) {
        System.out.println("Original array");
        System.out.println("------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static void findNegativeNumbers (int[][] array) {
        System.out.println("Numbers of array cells that contain negative values");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("("+ i + ", " + j + "): has value " + array[i][j] + ";");
                }
            }
        }
    }
}