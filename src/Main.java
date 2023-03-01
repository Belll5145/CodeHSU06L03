import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] arr = {5.6, 7.3, 12.43, 8, -1, -9.7, 0, 2};
        double maxValue = findMax(arr);
        double minValue = findMin(arr);
        System.out.println(maxValue);
        System.out.println(minValue);
        double sum = findSum(arr);
        double average = findAverage(arr);
        System.out.println(average);
        System.out.println(sum);
        Arrays.sort(arr);
        for(double value : arr){
            System.out.print(value + " ");
        }
    }
    public static  double findMax(double[] arr){
        double max = 0;
        for(double array : arr){
            if(max < array){
                max = array;
            }


        }
        return max;
    }
    public static double findMin(double[] arr) {
        double min = arr[0];
        for(int y = 0; y < arr.length; y++) {
            if(arr[y] < min) {
                min = arr[y];
            }

        }
        return min;
    }


    public static double findSum(double[] arr){
        double sum = 0;
        for (double array : arr){
            sum += array;
        }
        return sum;
    }

    public static double findAverage(double[] arr) {
        double avg = 0;
        for(int z = 0; z < arr.length; z++) {
            avg += arr[z];
        }
        avg /= arr.length;
        return avg;
    }





}